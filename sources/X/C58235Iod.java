package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;

/* renamed from: X.Iod  reason: case insensitive filesystem */
public final class C58235Iod extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58235Iod(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A06 = obj3;
        this.A09 = obj4;
        this.A05 = obj5;
        this.A08 = obj6;
        this.A04 = obj7;
        this.A01 = obj8;
        this.A07 = obj9;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            int intValue = ((HAD) this.A07).A02.intValue();
            if (intValue == 0) {
                C55952HqG hqG = (C55952HqG) this.A06;
                hqG.A00(C54682HOn.TAP_CHANGE_IMAGE_PLUS, (C62639Kk1) null);
                UserSession userSession = (UserSession) this.A09;
                String str = hqG.A00;
                String str2 = hqG.A01;
                0qQ.A0B(userSession, 0);
                C54096GzR gzR = new C54096GzR();
                Bundle A0a = AnonymousClass7TE.A0a();
                C227642jf.A04(A0a, userSession);
                A0a.putParcelable(C66579MXk.A00(1115), (ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) this.A08);
                A0a.putString("analytics_customization_flow_entrypoint", str);
                A0a.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                gzR.setArguments(A0a);
                gzR.A00 = (OJf) this.A02;
                AnonymousClass37D A022 = AnonymousClass37D.A00.A02((Context) this.A01);
                if (A022 != null) {
                    A022.A0J(gzR);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else if (intValue == 1) {
                ((C55952HqG) this.A06).A00(C54682HOn.TAP_CHANGE_IMAGE, (C62639Kk1) null);
                AnonymousClass4DH r2 = (AnonymousClass4DH) this.A04;
                0qQ.A0B(r2, 0);
                C53027GhI ghI = (C53027GhI) ((OJf) this.A02).A00.A03.getValue();
                UserSession userSession2 = ghI.A00;
                0wc A0J = DbW.A0J(userSession2, r2.getModuleName());
                C254793t3 r1 = ghI.A04;
                new C71030OZh((Fragment) r2, A0J, userSession2, C300965yF.A05(r1), C300965yF.A01(r1).A00, C300965yF.A07(r1), 0, 47).A02(false);
            } else if (intValue == 2) {
                ((C55952HqG) this.A06).A00(C54682HOn.TAP_IMAGINE_BUTTON, (C62639Kk1) null);
                Object obj = this.A04;
                0qQ.A0B(obj, 0);
                2YL A0H = DbS.A0H(((OJf) this.A02).A00.A03);
                AnonymousClass7TE.A1Z(new C73568Pfp(obj, A0H, (AnonymousClass4D7) null, 20), C318116oQ.A00(A0H));
            } else {
                throw AnonymousClass7TE.A1K();
            }
            ((C285165Qa) this.A03).AHc(false);
            C286225Uk r0 = (C286225Uk) this.A05;
            if (r0 != null) {
                r0.hide();
            }
            return C60340gF.A00;
        }
        AnonymousClass95B r02 = AnonymousClass95B.$redex_init_class;
        AnonymousClass95G r4 = (AnonymousClass95G) ((AnonymousClass0eM) this.A08).getValue();
        AnonymousClass95H r5 = (AnonymousClass95H) ((AnonymousClass0eM) this.A04).getValue();
        AnonymousClass95C r3 = (AnonymousClass95C) this.A03;
        String str3 = ((UserSession) this.A09).A06;
        return new AnonymousClass95B((Context) this.A02, (AnonymousClass0JP) AnonymousClass7TE.A14((AnonymousClass0eM) this.A01), r3, r4, r5, (AnonymousClass95F) ((AnonymousClass0eM) this.A05).getValue(), (AnonymousClass95D) this.A06, (AnonymousClass95J) ((AnonymousClass0eM) this.A07).getValue(), str3);
    }
}
