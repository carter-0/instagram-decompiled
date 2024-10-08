package X;

import android.content.DialogInterface;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.VideoSession;

/* renamed from: X.JiK  reason: case insensitive filesystem */
public final class C60263JiK extends 2YL {
    public final UserSession A00;
    public final AnonymousClass0r6 A01;
    public final 0V2 A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final boolean A05;

    public C60263JiK(UserSession userSession, boolean z) {
        C61039Jvd jvd;
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        boolean z2 = z;
        this.A05 = z;
        05D A012 = 10D.A01(AnonymousClass05K.A01, 0, 1);
        this.A02 = A012;
        this.A01 = A012;
        if (A02()) {
            boolean z3 = !z;
            jvd = new C61039Jvd(AnonymousClass05K.A0Y, z3, z3, z3, z2, true);
        } else {
            jvd = new C61039Jvd(AnonymousClass05K.A00, !z, true, true, z2, true);
        }
        02z A10 = DbS.A10(jvd);
        this.A03 = A10;
        this.A04 = A10;
    }

    public final void A01(JWG jwg, C3499682q r9, AnonymousClass3Q2 r10) {
        0f9 r2;
        String str;
        String str2;
        CreationSession creationSession = ((JWE) r9).A01;
        VideoSession A042 = creationSession.A04();
        A042.getClass();
        if (C64138LPn.A02(0, A042.A00, false)) {
            if (r9.COf()) {
                str2 = "edit_carousel";
            } else {
                str2 = "share_screen";
            }
            AnonymousClass6SR.A01().A07(this.A00, str2, true);
            jwg.A0A((DialogInterface.OnClickListener) null, AnonymousClass05K.A01);
            if (r10 != null) {
                this.A02.FIA(new C61872KPl(r10.A35));
                return;
            } else {
                r2 = 0wj.A01.AEf(K6A.__redex_internal_original_name, 817901174);
                str = "Getting pendingMedia failed";
            }
        } else {
            r2 = 0wj.A01.AEf(K6A.__redex_internal_original_name, 817901174);
            VideoSession A043 = creationSession.A04();
            A043.getClass();
            str = 002.A0N("Invalid aspect ratio: ", A043.A00);
        }
        r2.ABQ(DialogModule.KEY_MESSAGE, str);
        r2.report();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r2.A02().A0C == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C3499682q r6) {
        /*
            r5 = this;
            r4 = 0
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36328564261404079(0x8110a300003daf, double:3.037668550074143E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002b
            X.JWE r6 = (X.JWE) r6
            com.instagram.creation.base.CreationSession r2 = r6.A01
            com.instagram.creation.base.VideoSession r0 = r2.A04()
            if (r0 == 0) goto L_0x002c
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r0.A0D
            if (r1 == 0) goto L_0x002c
        L_0x001e:
            com.instagram.creation.base.VideoSession r0 = r2.A04()
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r0.A0E
            boolean r4 = X.C364978mK.A06(r1, r0)
        L_0x002b:
            return r4
        L_0x002c:
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            if (r0 == 0) goto L_0x003b
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            boolean r1 = r0.A0C
            r0 = 1
            if (r1 != 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r1 = X.C364978mK.A01(r3, r0)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60263JiK.A03(X.82q):boolean");
    }

    public final void A00() {
        Object value;
        Integer num;
        boolean z;
        boolean A1X;
        05G r3 = this.A03;
        do {
            value = r3.getValue();
            num = AnonymousClass05K.A00;
            z = ((C61039Jvd) value).A04;
            A1X = JTQ.A1X(num);
        } while (!r3.AIY(value, new C61039Jvd(num, !this.A05, A1X, A1X, z, A1X)));
    }

    public final boolean A02() {
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36328590031338949L) || 182.A06(r2, userSession, 36328590031535560L)) {
            return true;
        }
        return false;
    }
}
