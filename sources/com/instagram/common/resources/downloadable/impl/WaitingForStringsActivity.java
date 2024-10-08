package com.instagram.common.resources.downloadable.impl;

import X.002;
import X.00l;
import X.02m;
import X.0kR;
import X.0nQ;
import X.0nY;
import X.0qQ;
import X.13u;
import X.1Ks;
import X.1Zu;
import X.2Yn;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass11c;
import X.AnonymousClass13o;
import X.AnonymousClass1Qr;
import X.AnonymousClass2Yr;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11495SbI;
import X.C249363jc;
import X.C255183ti;
import X.C296675qS;
import X.DbT;
import X.Pxf;
import X.T0J;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Locale;

public final class WaitingForStringsActivity extends Activity implements AnonymousClass2Yr {
    public static final String A0A = Pxf.A0e(WaitingForStringsActivity.class, "i18n");
    public View A00;
    public View A01;
    public View A02;
    public 13u A03;
    public AnonymousClass1Qr A04;
    public Intent A05;
    public View A06;
    public boolean A07;
    public final View.OnClickListener A08 = new C11495SbI(this, 11);
    public volatile boolean A09;

    public static final void A00(WaitingForStringsActivity waitingForStringsActivity) {
        1Ks r2;
        String str;
        View view = waitingForStringsActivity.A01;
        if (view == null) {
            str = "progressView";
        } else {
            view.setVisibility(0);
            View view2 = waitingForStringsActivity.A00;
            if (view2 == null) {
                str = "errorView";
            } else {
                view2.setVisibility(8);
                AnonymousClass1Qr r1 = waitingForStringsActivity.A04;
                if (r1 == null) {
                    str = "stringResourcesDelegate";
                } else {
                    synchronized (r1) {
                        r2 = r1.A00;
                    }
                    if (r2 == null) {
                        r2 = new 1Ks(new 1Zu(true, (Throwable) null));
                    }
                    C255183ti.A04(new T0J(waitingForStringsActivity, 12), r2, new 0nQ(0nY.A00(), 57, 3, true, false));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(WaitingForStringsActivity waitingForStringsActivity) {
        Intent intent = waitingForStringsActivity.A05;
        if (intent == null) {
            0qQ.A0F("returnIntent");
            throw AnonymousClass00P.createAndThrow();
        }
        Intent intent2 = new Intent(intent);
        intent2.setFlags(intent2.getFlags() & -268435457);
        if ("android.intent.action.SEND".equals(intent2.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent2.getAction()) || "com.instagram.share.ADD_TO_STORY".equals(intent2.getAction())) {
            intent2.setFlags(intent2.getFlags() & -2);
        }
        if (waitingForStringsActivity.A07) {
            0kR.A0B(waitingForStringsActivity, intent2);
        } else {
            intent2.setPackage("com.instagram.android");
            0kR.A09(waitingForStringsActivity.getApplicationContext(), intent2);
        }
        waitingForStringsActivity.finish();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String str;
        String str2;
        int A022 = Pxf.A02(this, 1726200309);
        super.onCreate(bundle);
        getTheme().applyStyle(2Yn.A00(), true);
        AnonymousClass11c A002 = AnonymousClass11c.A00();
        0qQ.A07(A002);
        if (A002 instanceof AnonymousClass13o) {
            AnonymousClass13o r1 = (AnonymousClass13o) A002;
            AnonymousClass1Qr r0 = r1.A01;
            0qQ.A0A(r0);
            this.A04 = r0;
            this.A03 = r1.A00;
            C249363jc A012 = r1.A01();
            Intent intent = getIntent();
            if (intent != null) {
                this.A07 = intent.getBooleanExtra("from_trusted_caller", false);
                Parcelable parcelableExtra = intent.getParcelableExtra("return_intent");
                0qQ.A0A(parcelableExtra);
                Intent intent2 = (Intent) parcelableExtra;
                this.A05 = intent2;
                if (intent2 == null) {
                    str2 = "returnIntent";
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                } else if (intent2.getExtras() != null) {
                    Bundle extras = intent2.getExtras();
                    0qQ.A0A(extras);
                    ClassLoader A0W = Pxf.A0W(this);
                    if (A0W != null) {
                        extras.setClassLoader(A0W);
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("getClassLoader should only return null if the class is a primitive");
                        i = -1436576493;
                    }
                }
            }
            setContentView(R.layout.ig_waiting_screen);
            this.A00 = requireViewById(R.id.loading_strings_error_view);
            this.A01 = requireViewById(R.id.loading_strings_progress_view);
            AnonymousClass1Qr r02 = this.A04;
            if (r02 == null) {
                str2 = "stringResourcesDelegate";
            } else {
                Locale A032 = r02.A03();
                0qQ.A07(A032);
                if (A032.getLanguage().equals("cb")) {
                    A032 = new Locale("ckb", A032.getCountry());
                }
                String A10 = DbT.A10(A032);
                String displayName = A032.getDisplayName(A032);
                if ("fb".equals(A10)) {
                    displayName = "FB Hash";
                } else if ("qz".equals(A10)) {
                    Locale locale = new Locale("my");
                    String displayName2 = locale.getDisplayName(locale);
                    if (displayName2 == null || displayName2.length() == 0 || displayName2.equals("မြန်မာ")) {
                        str = "ျမန္မာ";
                    } else {
                        str = "ဗမာ";
                    }
                    displayName = 002.A0R(str, " (Zawgyi)");
                } else if ("mp".equalsIgnoreCase(A10)) {
                    displayName = "ꯃꯅꯤꯄꯨꯔꯤ";
                }
                String A003 = C296675qS.A00(displayName);
                0qQ.A07(A003);
                View requireViewById = requireViewById(R.id.language_pack_loading_message);
                0qQ.A07(requireViewById);
                ((TextView) requireViewById).setText(AnonymousClass7TF.A0e(A012, A003, R.string.f0nameremoved));
                View requireViewById2 = requireViewById(R.id.language_pack_loading_failed_message);
                0qQ.A07(requireViewById2);
                TextView textView = (TextView) requireViewById2;
                String A16 = AnonymousClass7TE.A16(getBaseContext(), getApplicationContext().getApplicationInfo().labelRes);
                if (00l.A0W(A16)) {
                    A16 = "Instagram";
                }
                textView.setText(A012.getString(R.string.f0nameremoved, new Object[]{A003, A16}));
                View requireViewById3 = requireViewById(R.id.use_english_button);
                this.A02 = requireViewById3;
                if (requireViewById3 == null) {
                    str2 = "useEnglishButton";
                } else {
                    AnonymousClass0fU.A00(this.A08, requireViewById3);
                    View requireViewById4 = requireViewById(R.id.retry_button);
                    this.A06 = requireViewById4;
                    if (requireViewById4 == null) {
                        str2 = "retryButton";
                    } else {
                        C11495SbI.A00(requireViewById4, 10, this);
                        A00(this);
                        AnonymousClass0fD.A07(-262338185, A022);
                        return;
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        illegalStateException = AnonymousClass7TE.A0z("This activity should not be triggered when string resources are not downloadable");
        i = 521619625;
        AnonymousClass0fD.A07(i, A022);
        throw illegalStateException;
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(1181165249);
        super.onPause();
        02m.A0p.markerEnd(4456452, 2);
        AnonymousClass0fD.A07(-766914221, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(451683083);
        super.onResume();
        02m.A0p.markerStart(4456452);
        AnonymousClass0fD.A07(-681791387, A002);
    }
}
