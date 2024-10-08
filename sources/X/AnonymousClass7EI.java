package X;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashMap;

/* renamed from: X.7EI  reason: invalid class name */
public final class AnonymousClass7EI implements C328007Db {
    public boolean A00;
    public final Activity A01;
    public final UserSession A02;
    public final C71662eb A03;
    public final AnonymousClass7VM A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.A00 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324677316915432(0x810d1a000e30e8, double:3.0352104307280536E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0015
            X.2eb r2 = r4.A03
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x0022
        L_0x0015:
            X.2eb r2 = r4.A03
            android.view.View r1 = r2.A01()
            X.0qQ.A07(r1)
            r0 = 0
            r1.setOnClickListener(r0)
        L_0x0022:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x003a
            android.view.View r0 = r2.A01()
            X.0qQ.A07(r0)
            X.2el r1 = X.AnonymousClass2hM.A00(r0)
            if (r1 == 0) goto L_0x003a
            android.view.View r0 = r2.A01()
            r1.A04(r0)
        L_0x003a:
            r0 = 8
            r2.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EI.A00():void");
    }

    public final void A01(C3255473b r15) {
        String str;
        HashMap hashMap = r15.A08;
        if (hashMap != null && !this.A00) {
            this.A00 = true;
            View A012 = this.A03.A01();
            0qQ.A07(A012);
            2el A002 = AnonymousClass2hM.A00(A012);
            String str2 = null;
            C59671JTb jTb = new C59671JTb(11);
            MessageIdentifier messageIdentifier = r15.A04;
            if (messageIdentifier != null) {
                str2 = messageIdentifier.A01;
            }
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r1 = new C2354830a(r15, jTb, str2);
            r1.A00(new C64893Ljt(this, hashMap));
            AnonymousClass30Y A013 = r1.A01();
            if (A002 != null) {
                A002.A05(BJd(), A013);
            }
        }
        C71662eb r02 = this.A03;
        r02.A03(0);
        View A014 = r02.A01();
        0qQ.A07(A014);
        TextView textView = (TextView) A014;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(r15.A03);
        AnonymousClass7XM r8 = (AnonymousClass7XM) this.A04;
        CharSequence charSequence = r15.A05;
        Context context = textView.getContext();
        0qQ.A07(context);
        MessageIdentifier messageIdentifier2 = r15.A04;
        String str3 = null;
        if (messageIdentifier2 != null) {
            str = messageIdentifier2.A01;
        } else {
            str = null;
        }
        int i = r15.A00;
        Spannable CnI = r8.CnI(context, charSequence, str, i, true);
        if (messageIdentifier2 != null) {
            str3 = messageIdentifier2.A01;
        }
        Spannable CnI2 = r8.CnI(context, CnI, str3, i, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(CnI2);
        String string = context.getString(2131959739);
        0qQ.A07(string);
        if (new C227422jG(this.A02).A00() && 00l.A0d(CnI2, string, false)) {
            AnonymousClass7AV.A06(spannableStringBuilder, new C69189Ngn(this), string, context.getColor(R.color.igds_prism_blue_05));
        }
        textView.setText(spannableStringBuilder);
        int A042 = (int) 0nA.A04(context, r15.A01);
        textView.setPadding(A042, 0, A042, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        textView.setGravity(r15.A02);
        String str4 = r15.A06;
        if (str4 != null) {
            AnonymousClass0fU.A00(new C71334Oij(this, r15, str4), textView);
        }
    }

    public final View BJd() {
        C71662eb r1 = this.A03;
        if (r1.A00 != null) {
            View A012 = r1.A01();
            0qQ.A07(A012);
            return A012;
        }
        ViewStub viewStub = r1.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("View Stub must not be null");
    }

    public AnonymousClass7EI(Activity activity, UserSession userSession, C71662eb r3, AnonymousClass7VM r4) {
        this.A02 = userSession;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = activity;
    }
}
