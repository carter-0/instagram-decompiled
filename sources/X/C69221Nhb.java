package X;

import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.FollowStatus;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Nhb  reason: case insensitive filesystem */
public final class C69221Nhb extends C252323ov {
    public static String A01 = "";
    public static C69221Nhb A02;
    public final OUG A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4OC] */
    public final void A0A(0xI r4, C263934Nx r5) {
        0qQ.A0B(r4, 0);
        ? obj = new Object();
        obj.A0F = 0;
        r4.A08(0, AnonymousClass000.A00(1516));
        if (r5 != null) {
            r5.A07 = obj;
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass4OR A05(Object obj) {
        C74438Put put = (C74438Put) obj;
        0qQ.A0B(put, 0);
        C263844No A0C = A07(put);
        0bb r3 = new 0bb();
        AnonymousClass4OU r0 = AnonymousClass4OT.A00;
        String str = A0C.A0B;
        r3.A05("media_id", Long.valueOf(r0.A01(str)));
        C66582MXn.A18(AnonymousClass4OQ.ORGANIC, r3, this);
        r3.A06("tracking_token", A0C.A0I);
        r3.A06("pre_processing_media_id", str);
        return r3;
    }

    public final /* bridge */ /* synthetic */ C263974Ob A06(C263974Ob r6, Object obj) {
        String str;
        ProductType productType;
        C74438Put put = (C74438Put) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, put, r6);
        super.A06(r6, put);
        AnonymousClass3WR r2 = A07(put).A04;
        if (r2 == null || (productType = r2.A09) == null || productType.equals(ProductType.FACEBOOK_VIDEO) != A1U) {
            str = "instagram_video";
        } else {
            str = "facebook_video";
        }
        r6.A06("media_app_type", str);
        r6.A06("video_format", C263984Oc.A01(r2, false, false));
        return r6;
    }

    public final Integer A08() {
        return AnonymousClass05K.A07;
    }

    /* renamed from: A0C */
    public final C263844No A07(C74438Put put) {
        1iA r6;
        1iA r62;
        C74438Put put2 = put;
        0qQ.A0B(put2, 0);
        if (put2 instanceof N54) {
            N54 n54 = (N54) put2;
            String str = n54.A05;
            boolean z = n54.A0A;
            int intValue = n54.A03.intValue();
            if (intValue == 1) {
                r62 = 1iA.A0a;
            } else if (intValue == 0) {
                r62 = 1iA.A0Q;
            } else if (intValue != 3) {
                r62 = null;
            } else {
                r62 = 1iA.A09;
            }
            AnonymousClass3WR A012 = this.A00.A01(n54);
            C61037Jvb jvb = n54.A01;
            0qQ.A0A(jvb);
            String str2 = jvb.A01;
            int A08 = 00l.A08(str2, "_", 0, false);
            0qQ.A0A(jvb);
            if (A08 >= 0) {
                str2 = C66580MXl.A0z(str2, A08 + 1);
            }
            String str3 = n54.A07;
            AnonymousClass3QO r5 = AnonymousClass3QO.DEFAULT;
            0qQ.A0B(str, 1);
            return new C263844No(r5, r62, (FollowStatus) null, A012, (Boolean) null, str, (String) null, str, str3, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, false, false, false, z, false);
        } else if (put2 instanceof N53) {
            N53 n53 = (N53) put2;
            String str4 = n53.A02;
            boolean z2 = n53.A08;
            1iA r63 = 1iA.A0a;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("COWATCH_");
            String A0i = AnonymousClass7TF.A0i(UUID.randomUUID(), A1A);
            AnonymousClass3WR A013 = this.A00.A01(n53);
            AnonymousClass3QO r52 = AnonymousClass3QO.DEFAULT;
            0qQ.A0B(str4, 1);
            return new C263844No(r52, r63, (FollowStatus) null, A013, (Boolean) null, str4, (String) null, str4, A0i, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, false, true, false, z2, false);
        } else if (put2 instanceof N52) {
            N52 n52 = (N52) put2;
            String str5 = n52.A04;
            boolean z3 = n52.A07;
            if (z3) {
                r6 = 1iA.A0a;
            } else {
                r6 = 1iA.A0Q;
            }
            AnonymousClass3WR A014 = this.A00.A01(n52);
            AnonymousClass3QO r53 = AnonymousClass3QO.DEFAULT;
            0qQ.A0B(str5, 1);
            return new C263844No(r53, r6, (FollowStatus) null, A014, (Boolean) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, false, false, false, z3, false);
        } else {
            throw AnonymousClass7TE.A0w("Unsupported content type");
        }
    }

    public C69221Nhb(AnonymousClass4DU r1, OUG oug, String str) {
        super(r1, str);
        this.A00 = oug;
    }
}
