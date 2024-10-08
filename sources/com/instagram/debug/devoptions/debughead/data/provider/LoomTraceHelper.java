package com.instagram.debug.devoptions.debughead.data.provider;

import X.002;
import X.0VH;
import X.0VY;
import X.0kR;
import X.0vh;
import X.AnonymousClass0VI;
import X.C59689JTv;
import X.C63080xw;
import X.C71172bH;
import X.DbS;
import X.DbZ;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import com.instagram.debug.devoptions.apiperf.LoomTraceProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.LoomTraceDelegate;

public class LoomTraceHelper implements LoomTraceProvider {
    public static LoomTraceHelper sInstance;
    public final Context mAppContext;
    public LoomTraceDelegate mDelegate;
    public boolean mIsTracing;

    public static synchronized LoomTraceHelper getInstance(Context context) {
        LoomTraceHelper loomTraceHelper;
        synchronized (LoomTraceHelper.class) {
            loomTraceHelper = sInstance;
            if (loomTraceHelper == null) {
                loomTraceHelper = new LoomTraceHelper(context);
                sInstance = loomTraceHelper;
            }
        }
        return loomTraceHelper;
    }

    public void startTrace() {
        0VY r4;
        if (!this.mIsTracing && (r4 = 0VY.A0A) != null) {
            0VH.A00().A01((TraceConfigExtras) null, C63080xw.A00);
            AnonymousClass0VI.A00(r4);
            r4.A09(0, 0vh.A00, 1);
        }
        this.mIsTracing = true;
    }

    public void stopTrace() {
        String str;
        if (this.mIsTracing) {
            0VY r4 = 0VY.A0A;
            if (r4 == null) {
                str = null;
            } else {
                TraceContext A01 = 0VY.A01(r4, (Object) null, 0vh.A00, 0);
                if (A01 == null) {
                    str = null;
                } else {
                    str = A01.A0D;
                }
            }
            String A0R = 002.A0R("a2 ", str);
            0VY r42 = 0VY.A0A;
            if (r42 != null) {
                r42.A08(0, 0vh.A00);
            }
            LoomTraceDelegate loomTraceDelegate = this.mDelegate;
            if (loomTraceDelegate != null) {
                loomTraceDelegate.onLoomTraceCompleted();
            }
            ClipboardManager clipboardManager = (ClipboardManager) DbZ.A0e(this.mAppContext);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(A0R, A0R));
            }
            Context context = (Context) C71172bH.A00();
            if (context != null) {
                Intent A09 = DbS.A09();
                A09.setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", A0R).setType("text/plain");
                0kR.A00(context, Intent.createChooser(A09, (CharSequence) null));
            } else {
                C59689JTv.A08(this.mAppContext, 2131975502, 1);
            }
        }
        this.mIsTracing = false;
    }

    public LoomTraceHelper(Context context) {
        this.mAppContext = context;
    }

    public void setDelegate(LoomTraceDelegate loomTraceDelegate) {
        this.mDelegate = loomTraceDelegate;
    }
}
