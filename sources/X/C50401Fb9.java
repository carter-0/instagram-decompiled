package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Collections;

/* renamed from: X.Fb9  reason: case insensitive filesystem */
public final class C50401Fb9 implements AnonymousClass7X7, AnonymousClass7X8 {
    public final Activity A00;
    public final Context A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C273434mZ A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final C62320sa A08;

    public C50401Fb9(Activity activity, Fragment fragment, AnonymousClass0iw r4, UserSession userSession, C273434mZ r6, C62320sa r7, C62320sa r8, C62320sa r9) {
        0qQ.A0B(fragment, 3);
        this.A04 = userSession;
        this.A00 = activity;
        this.A02 = fragment;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A01 = activity;
    }

    public final void Cpj(String str) {
        0qQ.A0B(str, 0);
        Context context = this.A01;
        float A09 = (float) 0nA.A09(context);
        float A082 = (float) 0nA.A08(context);
        RectF rectF = new RectF(0.0f, 0.0f, A09, A082);
        rectF.offsetTo(0.0f, A082);
        FFV.A03(this.A00, rectF, this.A04, str, this.A03.getModuleName());
    }

    public final void CqV(OMU omu, 1Ns r18, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String str4 = str;
        0qQ.A0B(str4, 0);
        C333517Zg r0 = (C333517Zg) this.A06.invoke();
        if (r0 != null) {
            C254783t2 C6c = r0.C6l().C6c();
            0qQ.A07(C6c);
            boolean z4 = C6c instanceof AnonymousClass9HR;
            String str5 = str2;
            ((C330367Mm) this.A08.invoke()).A00(omu, r18, new C51142FpE(this, str4, str5, str3, z, z2, z3), str4, str5, z4, z4);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.G6K, java.lang.Object] */
    public final void CqU(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String str4 = str;
        String str5 = str2;
        boolean A1Z = AnonymousClass7TG.A1Z(str4, str5);
        UserSession userSession = this.A04;
        AnonymousClass8HT A002 = AnonymousClass8HS.A00(userSession, (C357638Yz) null);
        29E r6 = A002.A03;
        long A032 = r6.A03(17315248, 12000);
        A002.A02 = A032;
        r6.A09(A032, C273654mx.A00(2318), RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        Activity activity = this.A00;
        C273434mZ r9 = this.A05;
        Fragment fragment = this.A02;
        String A003 = AnonymousClass000.A00(441);
        ? obj = new Object();
        28D r62 = 28D.A2V;
        AnonymousClass9PJ.A00(userSession).A07(r62, A1Z);
        C50905Fkk fkk = new C50905Fkk(activity, fragment, r62, userSession, (1Xj) null, r9, obj, A003, str3, str4, str5, z);
        if (!z2) {
            C49007Enj.A00(activity, new C49981FHq(fkk), z3);
        } else {
            fkk.Dje(Collections.singletonList(Boolean.valueOf(A1Z)));
        }
    }

    public final void CqW(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        02m.A0p.markerStart(18941461);
        ((C66650MaJ) this.A07.invoke()).A02(reel, AnonymousClass3BQ.DIRECT_THREAD_HEADER, gradientSpinnerAvatarView);
    }

    public final void CqX(RectF rectF, OMU omu, MessageIdentifier messageIdentifier, 1Ns r23, String str, String str2, String str3, String str4, String str5) {
        1Ns r13 = r23;
        String str6 = str;
        String str7 = str2;
        AnonymousClass7TG.A1T(str6, str7, r13);
        AnonymousClass7TF.A1F(messageIdentifier, 7, str5);
        C333517Zg r0 = (C333517Zg) this.A06.invoke();
        if (r0 != null) {
            AnonymousClass7S7 C6l = r0.C6l();
            C254783t2 C6c = C6l.C6c();
            0qQ.A07(C6c);
            boolean z = C6c instanceof AnonymousClass9HR;
            C254743sy B8S = C6l.B8S();
            0qQ.A07(B8S);
            if (C66647MaG.A04(B8S) != null) {
                C66647MaG.A03(B8S);
            } else if (B8S instanceof MsysThreadId) {
                String.valueOf(((MsysThreadId) B8S).A02);
            }
            C6l.C6Z(this.A01);
            UserSession userSession = this.A04;
            02m.A0p.markerStart(18941461);
            C330367Mm r8 = (C330367Mm) this.A08.invoke();
            AnonymousClass0iw r7 = this.A03;
            0sn r12 = 0sn.A00;
            0qQ.A0B(r12, 10);
            C330367Mm r11 = r8;
            r11.A00(omu, r13, new C51143FpF(rectF, r7, r8, str6, str3, str4, r12), str6, str7, z, z);
            C3265677h.A0I(r7, userSession, 2FW.A1T.A00);
        }
    }
}
