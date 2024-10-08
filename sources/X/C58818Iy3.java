package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Iy3  reason: case insensitive filesystem */
public final class C58818Iy3 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58818Iy3(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(1);
        this.A00 = i;
        this.A08 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
        this.A06 = obj6;
        this.A05 = obj7;
        this.A07 = obj8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        HLF hlf;
        Object obj2 = obj;
        if (this.A00 != 0) {
            View view = (View) obj2;
            if (view != null) {
                C52150GGs gGs = (C52150GGs) this.A08;
                UserSession userSession = gGs.A01;
                C267324bN r8 = (C267324bN) this.A04;
                boolean CcK = r8.CcK();
                0rh r3 = (0rh) this.A02;
                float f = r3.A00;
                0rh r4 = (0rh) this.A03;
                if (GL7.A00(view, userSession, f, r4.A00, CcK)) {
                    C59599JPt jPt = gGs.A07;
                    User user = (User) this.A01;
                    jPt.EGO(r8, user);
                    C52080GEa gEa = gGs.A08;
                    if (gEa.A0H) {
                        hlf = HLF.INFLUENCER;
                    } else {
                        hlf = HLF.BRAND;
                    }
                    0eP A002 = C52150GGs.A00(view, ((AnonymousClass3Y5) this.A06).A05, r8, gGs, r3.A00, r4.A00);
                    JTB jtb = gGs.A03;
                    C52058GDe gDe = (C52058GDe) this.A05;
                    View view2 = null;
                    if (0qQ.A0K(view.getTag(), "clips_author_info_profile_pic_component")) {
                        view2 = view;
                    }
                    jtb.Da6(view2, r8, gDe, hlf, user, Boolean.valueOf(gGs.A0C), Boolean.valueOf(gEa.A0F), (Float) null, (Float) null, (Float) A002.A00, (Float) A002.A01, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, (String) null, (String) null, (C62320sa) this.A07, false, gGs.A0B);
                }
            }
        } else {
            C305006Gb A0L = C51968G9o.A0L(obj2);
            List list = (List) this.A02;
            C59037J3w j3w = C59037J3w.A00;
            C59038J3x j3x = C59038J3x.A00;
            Object obj3 = this.A01;
            Object obj4 = this.A05;
            Object obj5 = this.A08;
            Object obj6 = this.A04;
            Object obj7 = this.A06;
            Object obj8 = this.A03;
            Object obj9 = this.A07;
            C51967G9n.A12(A0L, new C67609Mqh(1, obj5, list, obj8, obj4, obj6, obj9, obj7, obj3), new MPB(33, list, (0sP) j3w), new MPB(34, list, (0sP) j3x), list.size());
        }
        return C60340gF.A00;
    }
}
