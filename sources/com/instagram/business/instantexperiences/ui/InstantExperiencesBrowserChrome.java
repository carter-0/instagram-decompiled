package com.instagram.business.instantexperiences.ui;

import X.0cp;
import X.AnonymousClass7TE;
import X.C11382SQu;
import X.C13495TbM;
import X.DbU;
import X.SVE;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class InstantExperiencesBrowserChrome extends LinearLayout {
    public Context A00;
    public FrameLayout A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public C13495TbM A07;
    public C11382SQu A08;
    public UserSession A09;
    public Executor A0A;
    public final DialogInterface.OnClickListener A0B = SVE.A00(this, 40);

    public void setInstantExperiencesBrowserChromeListener(C13495TbM tbM) {
        this.A07 = tbM;
    }

    public InstantExperiencesBrowserChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = context;
    }

    /* access modifiers changed from: private */
    public CharSequence[] getMenuOptions() {
        Uri A032;
        ArrayList A1C = AnonymousClass7TE.A1C();
        CharSequence[] charSequenceArr = new CharSequence[A1C.size()];
        Context context = getContext();
        DbU.A19(context, A1C, 2131964405);
        DbU.A19(context, A1C, 2131964401);
        if (!(this.A08.A0D.peek() == null || C11382SQu.A01(this) == null || (A032 = 0cp.A03(C11382SQu.A01(this))) == null || (!"http".equals(A032.getScheme()) && !"https".equals(A032.getScheme())))) {
            DbU.A19(context, A1C, 2131964404);
        }
        DbU.A19(context, A1C, 2131964400);
        return (CharSequence[]) A1C.toArray(charSequenceArr);
    }

    public InstantExperiencesBrowserChrome(Context context) {
        super(context);
    }
}
