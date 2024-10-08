package X;

import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.DlJ  reason: case insensitive filesystem */
public final class C46789DlJ extends 2YL {
    public String A00;
    public final UserSession A01;
    public final OpalRepository A02;
    public final C46461DfP A03;
    public final User A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    public final void A04(OpalProfileData opalProfileData) {
        Object value;
        Object value2;
        05G r2 = this.A05;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C47183Dry.A00((C61052Jvq) null, opalProfileData, opalProfileData, (C62520KhB) null, (C47183Dry) value, (Integer) null, 0, 2044, false, false)));
        05G r22 = this.A02.A08;
        do {
            value2 = r22.getValue();
        } while (!r22.AIY(value2, C61074JwC.A00((C61074JwC) value2, opalProfileData)));
    }

    public final void A05(String str) {
        Object value;
        C47183Dry dry;
        05G r3 = this.A05;
        do {
            value = r3.getValue();
            dry = (C47183Dry) value;
        } while (!r3.AIY(value, C47183Dry.A00((C61052Jvq) null, OpalProfileData.A00(dry.A05, (C62520KhB) null, (String) null, (String) null, (String) null, str, (String) null, (List) null, 0, 8095, false, false), (OpalProfileData) null, (C62520KhB) null, dry, (Integer) null, 0, 2046, false, false)));
    }

    public final void A06(boolean z) {
        String str = this.A00;
        if (str != null) {
            AnonymousClass7TE.A1Z(new MEW(this, str, (AnonymousClass4D7) null, 13, z), C318116oQ.A00(this));
        }
    }

    public /* synthetic */ C46789DlJ(UserSession userSession, OpalRepository opalRepository) {
        Object value;
        UserSession userSession2 = userSession;
        C46461DfP dfP = new C46461DfP(userSession2);
        0qQ.A0B(userSession2, 1);
        this.A01 = userSession2;
        this.A02 = opalRepository;
        this.A03 = dfP;
        C62520KhB khB = C62520KhB.Uninitialized;
        List list = 0sn.A00;
        OpalProfileData opalProfileData = new OpalProfileData(khB, "", "", "", "", (String) null, "", list, 0, false, false, false, false);
        OpalProfileData opalProfileData2 = new OpalProfileData(khB, "", "", "", "", (String) null, "", list, 0, false, false, false, false);
        OpalProfileData opalProfileData3 = opalProfileData;
        OpalProfileData opalProfileData4 = opalProfileData2;
        C62520KhB khB2 = khB;
        02z A10 = DbS.A10(new C47183Dry((C61052Jvq) null, new C61064Jw2((C62520KhB) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), new C61064Jw2((C62520KhB) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 4, false), opalProfileData3, opalProfileData4, khB2, AnonymousClass05K.A0C, AnonymousClass62M.A01, 0, false, false));
        this.A05 = A10;
        this.A06 = A10;
        this.A04 = AnonymousClass7TF.A0Q(userSession2);
        ArrayList A002 = JX7.A00(this.A01);
        05G r3 = this.A05;
        do {
            value = r3.getValue();
        } while (!r3.AIY(value, C47183Dry.A00((C61052Jvq) null, (OpalProfileData) null, (OpalProfileData) null, (C62520KhB) null, (C47183Dry) value, (Integer) null, 0, 1535, false, DbT.A1b(A002))));
        C51647Fy6.A02(this, C318116oQ.A00(this), 6);
    }

    public static final void A00(C46789DlJ dlJ) {
        Object value;
        UserSession userSession = dlJ.A01;
        if (182.A06(0Tu.A05, userSession, 36321082429350993L) && AnonymousClass7TE.A0q(userSession).getInt("opal_profile_tease_animation_count", 0) < 5) {
            05G r3 = dlJ.A05;
            do {
                value = r3.getValue();
            } while (!r3.AIY(value, C47183Dry.A00((C61052Jvq) null, (OpalProfileData) null, (OpalProfileData) null, (C62520KhB) null, (C47183Dry) value, AnonymousClass05K.A00, 0, 1791, false, false)));
        }
    }

    public final void A01() {
        String str = this.A00;
        if (str != null) {
            DbX.A1W(this, str, C318116oQ.A00(this), 9);
        }
    }

    public final void A02() {
        String str = this.A00;
        if (str != null) {
            DbX.A1W(this, str, C318116oQ.A00(this), 10);
        }
    }

    public final void A07(boolean z) {
        Object value;
        05G r2 = this.A05;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C47183Dry.A00((C61052Jvq) null, (OpalProfileData) null, (OpalProfileData) null, (C62520KhB) null, (C47183Dry) value, (Integer) null, 0, 1919, z, false)));
    }

    public final void onCleared() {
        OpalRepository opalRepository = this.A02;
        opalRepository.A00.A07(opalRepository.A06);
        opalRepository.A07.clear();
        AnonymousClass1Nd.A00(opalRepository.A04).A02(opalRepository.A01, 1qJ.class);
    }

    public final void A03(int i) {
        AnonymousClass7TE.A1Z(new C51647Fy6(this, (AnonymousClass4D7) null, i), C318116oQ.A00(this));
    }
}
