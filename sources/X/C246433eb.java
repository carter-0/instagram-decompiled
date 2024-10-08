package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3eb  reason: invalid class name and case insensitive filesystem */
public final class C246433eb implements C246453ed {
    public final UserSession A00;
    public final Fragment A01;
    public final AnonymousClass311 A02;
    public final AnonymousClass4DU A03;
    public final C231332rR A04;
    public final C2360232c A05;
    public final User A06;

    public C246433eb(Fragment fragment, UserSession userSession, AnonymousClass311 r4, AnonymousClass4DU r5, C231332rR r6, C2360232c r7, User user) {
        0qQ.A0B(r7, 6);
        this.A02 = r4;
        this.A00 = userSession;
        this.A03 = r5;
        this.A01 = fragment;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = user;
    }

    public final void D1v(C278014w6 r7, AnonymousClass1Xp r8, int i) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r7, 2);
        if (r8 instanceof 1Xj) {
            UserSession userSession = this.A00;
            AnonymousClass1Xp r82 = (1Xj) r8;
            AnonymousClass1Xp A1c = r82.A1c(i);
            if (A1c == null) {
                A1c = r82;
            }
            C56587I2r.A01(A1c, userSession);
            if (this.A01.isVisible()) {
                this.A04.Cs9(r82);
            }
            AnonymousClass4DU r3 = this.A03;
            AnonymousClass1Xp A1c2 = r82.A1c(i);
            if (A1c2 == null) {
                A1c2 = r82;
            }
            I2F.A00(HNS.CLEAR_MEDIA_COVER, HNP.A00(r7), A1c2, r3, userSession, AnonymousClass05K.A00);
        }
    }

    public final void D8I(C278014w6 r11, AnonymousClass1Xp r12, int i) {
        0qQ.A0B(r12, 0);
        Fragment fragment = this.A01;
        Context context = fragment.getContext();
        if (context != null) {
            1Xj r122 = (1Xj) r12;
            1Xj A1c = r122.A1c(i);
            if (A1c == null) {
                A1c = r122;
            }
            C56910IHf.A00(context, (DialogInterface.OnClickListener) null, fragment, new EBD(this, A1c), (1P0) null, new EBD(this, A1c), (1P0) null, (1P0) null, this.A00, A1c);
        }
    }

    public final void DVE(C278014w6 r9, AnonymousClass1Xp r10, int i) {
        String actionUrl;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r9, 2);
        if ((r10 instanceof 1Xj) && (actionUrl = r9.getActionUrl()) != null) {
            if (actionUrl.equals(C273654mx.A00(2177))) {
                AnonymousClass0kN.A01((AnonymousClass0iw) null, this.A00);
            }
            C2360232c r3 = this.A05;
            1Xj r102 = (1Xj) r10;
            1Xj A1c = r102.A1c(i);
            if (A1c == null) {
                A1c = r102;
            }
            AnonymousClass4DU r5 = this.A03;
            r3.A00((C2357230y) this.A02, (JOC) null, actionUrl, C56587I2r.A00(A1c, r5.getModuleName()));
            UserSession userSession = this.A00;
            1Xj A1c2 = r102.A1c(i);
            if (A1c2 == null) {
                A1c2 = r102;
            }
            HNS hns = HNS.OPEN_BLOKS_APP;
            hns.A00 = r9.getActionUrl();
            I2F.A00(hns, HNP.A00(r9), A1c2, r5, userSession, AnonymousClass05K.A00);
        }
    }
}
