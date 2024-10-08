package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.user.model.User;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;

/* renamed from: X.IxK  reason: case insensitive filesystem */
public final class C58773IxK extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58773IxK(Object obj, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C251243mn r6 = (C251243mn) obj2;
                0qQ.A0B(r6, 0);
                r6.FLe((C294145lv) this.A01, this.A03, this.A02, this.A04);
                break;
            case 1:
                C251243mn r62 = (C251243mn) obj2;
                0qQ.A0B(r62, 0);
                r62.FLg((C294145lv) this.A01, this.A03, this.A02, this.A04);
                break;
            case 2:
                C333867aH r63 = (C333867aH) obj2;
                0qQ.A0B(r63, 0);
                return C335067cK.A06(r63, this.A03, this.A02, new C58736Iwj(6, this.A01, this.A04));
            case 3:
                1Xl r64 = (1Xl) obj2;
                0qQ.A0B(r64, 0);
                C52971GgO ggO = (C52971GgO) this.A01;
                MediaCommentListRepository mediaCommentListRepository = ggO.A0A;
                C333867aH A0g = C51968G9o.A0g(mediaCommentListRepository);
                String str = this.A03;
                String str2 = this.A02;
                C335907dj A012 = C335067cK.A01(A0g, str, str2);
                if (A012 != null) {
                    boolean z = this.A04;
                    C333717a0 r5 = ggO.A0C;
                    String id = A012.A0C.getId();
                    C53335GmL gmL = ggO.A08;
                    Integer num = gmL.A04;
                    if (!z) {
                        if (num != null) {
                            i3 = num.intValue();
                        } else {
                            i3 = -1;
                        }
                        Integer num2 = gmL.A06;
                        if (num2 != null) {
                            i4 = num2.intValue();
                        } else {
                            i4 = -1;
                        }
                        r5.A07(r64, id, str, str2, i3, i4);
                    } else {
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = -1;
                        }
                        Integer num3 = gmL.A06;
                        if (num3 != null) {
                            i2 = num3.intValue();
                        } else {
                            i2 = -1;
                        }
                        r5.A08(r64, id, str, str2, i, i2);
                    }
                }
                boolean z2 = this.A04;
                String str3 = null;
                String A15 = C51968G9o.A15(AnonymousClass0eD.A00(ggO.A0E));
                User A11 = C51966G9m.A11(r64.BPf());
                if (A11 != null) {
                    str3 = A11.getId();
                }
                mediaCommentListRepository.A0H(r64, str, str2, z2, 0qQ.A0K(A15, str3));
                break;
            default:
                0qQ.A0B(obj2, 0);
                C54556HIr hIr = (C54556HIr) this.A01;
                hIr.A0H.invoke(obj2);
                if (obj2 instanceof C54551HIm) {
                    C52972GgP ggP = hIr.A01;
                    if (ggP == null) {
                        C51965G9l.A15();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    String str4 = this.A03;
                    String str5 = this.A02;
                    boolean z3 = this.A04;
                    HIK hik = HIK.A00;
                    C52972GgP.A03(ggP, hik);
                    ImagineGenerationImageRepository imagineGenerationImageRepository = ggP.A0E;
                    imagineGenerationImageRepository.A00 = true;
                    if (z3) {
                        C52972GgP.A03(ggP, hik);
                    }
                    if (ggP.A0G.A0D) {
                        imagineGenerationImageRepository.A0A.clear();
                        imagineGenerationImageRepository.A09.clear();
                    }
                    if (str4 != null) {
                        if (!C52972GgP.A08(ggP, str4)) {
                            str4 = 002.A0R("me ", str4);
                        }
                        C52972GgP.A05(ggP, (C57570Icx) null, (C56565I1t) null, str4, str5);
                    } else {
                        if (!AnonymousClass7TE.A1b(imagineGenerationImageRepository.A0A)) {
                            C58106ImS.A03(ggP, C318116oQ.A00(ggP), 40);
                        }
                        C52972GgP.A02(ggP, new HI8(ggP.A04), false);
                    }
                }
                hIr.A0A.A03.A0S();
                break;
        }
        return C60340gF.A00;
    }
}
