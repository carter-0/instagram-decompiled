package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Wqp  reason: case insensitive filesystem */
public final class C20405Wqp implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;

    public C20405Wqp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Object A00(0lg r1, Class cls, int i) {
        return r1.A01(cls, new C20405Wqp(r1, i));
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [X.VuQ, java.lang.Object] */
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return AnonymousClass50K.A00((0Df) this.A01).get("extra");
            case 1:
                ? obj = new Object();
                obj.A03 = null;
                obj.A01 = null;
                obj.A02 = null;
                obj.A05 = null;
                obj.A00 = (0lg) this.A01;
                return obj;
            case 2:
                return new WGU((UserSession) this.A01);
            case 3:
                return ((C14289TtN) this.A01).A06.getResources().getDrawable(R.drawable.instagram_add_filled);
            case 4:
                return new C52560GXl();
            case 5:
                C14273Tsw tsw = (C14273Tsw) this.A01;
                return new Tt4(tsw.A01, tsw.A00);
            case 6:
                return new VU7((UserSession) this.A01, (1ET) 1ET.A01.getValue());
            case 7:
                UserSession userSession = (UserSession) this.A01;
                return new VU8(AnonymousClass1Qz.A00(userSession), userSession);
            case 8:
                return new VQ5(AnonymousClass1Qz.A00((0lg) this.A01));
            case 9:
                return new VU9((0lg) this.A01);
            case 10:
                return new VQ8((UserSession) this.A01);
            case 11:
                return new VQ9((0lg) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C17515VYt((0lg) this.A01);
            case 13:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) this.A01;
                0qQ.A0B(polymorphicSerializer, 0);
                C20441Wrj A002 = C18700Vwy.A00("kotlinx.serialization.Polymorphic", new C20406Wqq(polymorphicSerializer, 1), C20800WzC.A00, new SerialDescriptor[0]);
                C62230ry r0 = polymorphicSerializer.A01;
                0qQ.A0B(r0, 1);
                return new C20438Wrg(r0, A002);
            default:
                C20441Wrj wrj = (C20441Wrj) this.A01;
                return Integer.valueOf(VJ7.A00(wrj, wrj.A05));
        }
    }
}
