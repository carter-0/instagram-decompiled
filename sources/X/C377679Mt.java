package X;

import android.content.Context;
import android.view.View;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Mt  reason: invalid class name and case insensitive filesystem */
public final class C377679Mt extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377679Mt(Object obj, Object obj2, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        List list;
        int i2;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i3;
        switch (this.A00) {
            case 0:
                i2 = ((Number) obj).intValue();
                lightweightQuickPerformanceLogger = ((IGTigonQuickPerformanceLogger) this.A02).logger;
                i3 = this.A01.hashCode();
                break;
            case 1:
                C299585vR r11 = (C299585vR) obj;
                0qQ.A0B(r11, 0);
                ((C299665vd) this.A01).DvU(r11, this.A03, ((C299595vS) ((C299575vQ) this.A02)).A00);
                break;
            case 2:
                C333867aH r112 = (C333867aH) obj;
                0qQ.A0B(r112, 0);
                String str = this.A03;
                Object obj2 = this.A01;
                Object obj3 = this.A02;
                0qQ.A0B(str, 1);
                0qQ.A0B(obj2, 2);
                0qQ.A0B(obj3, 3);
                return C335067cK.A08(r112, str, new C377469Ly(35, obj3, obj2));
            case 3:
                i2 = ((Number) obj).intValue();
                lightweightQuickPerformanceLogger = ((CacheBehaviorLogger) this.A02).logger;
                i3 = ((1QS) this.A01).A04;
                break;
            case 4:
                C250903mF r113 = (C250903mF) obj;
                0qQ.A0B(r113, 0);
                0rm r2 = (0rm) this.A01;
                AnonymousClass3HX r0 = (AnonymousClass3HX) r113.A03(((InspirationHubNetworkDataSource) this.A02).A00).get(this.A03);
                if (r0 != null) {
                    list = r0.A1j;
                } else {
                    list = null;
                }
                r2.A00 = list;
                break;
            case 5:
                0qQ.A0B(obj, 0);
                C3018760k r22 = (C3018760k) this.A02;
                String str2 = this.A03;
                AnonymousClass4AB r1 = (AnonymousClass4AB) this.A01;
                String id = r1.A0A.getId();
                ArrayList A04 = C3018760k.A04(r1, false);
                String str3 = r1.A03;
                Integer num = r1.A02;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                r22.A00 = new A7U(Boolean.valueOf(obj instanceof AnonymousClass9HR), str2, id, str3, A04, i);
                break;
            case 6:
                Context context = (Context) obj;
                0qQ.A0B(context, 0);
                C247633gf r4 = (C247633gf) this.A02;
                1Xj r3 = (1Xj) this.A01;
                String str4 = this.A03;
                boolean A022 = AnonymousClass3YZ.A00(r4.A00).A02(r3);
                0Pl r02 = r4.A01;
                if (A022) {
                    return r02.A0F(context, r3, str4);
                }
                return r02.A0E(context, r3, str4);
            case 7:
                Context context2 = (Context) obj;
                0qQ.A0B(context2, 0);
                String str5 = this.A03;
                return ((C247633gf) this.A02).A01.A0A(context2, (1Xj) this.A01, str5);
            case 8:
                Context context3 = (Context) obj;
                0qQ.A0B(context3, 0);
                String str6 = this.A03;
                return ((C247633gf) this.A02).A01.A09(context3, (1Xj) this.A01, str6);
            case 9:
                Context context4 = (Context) obj;
                0qQ.A0B(context4, 0);
                String str7 = this.A03;
                return ((C247633gf) this.A02).A01.A0G(context4, (1Xj) this.A01, str7);
            case 10:
                View view = (View) obj;
                0qQ.A0B(view, 0);
                C2354830a A002 = AnonymousClass30Y.A00(this.A01, C60340gF.A00, 002.A0R("XarDisclosureBanner_for_", this.A03));
                C335027cG r23 = (C335027cG) this.A02;
                A002.A00(new C387129li(r23));
                r23.A03.A05(view, A002.A01());
                break;
            case 11:
                0qQ.A0B(obj, 0);
                C243673Zt r42 = (C243673Zt) this.A02;
                AnonymousClass2VL.A00();
                C243663Zs r32 = (C243663Zs) r42.A00;
                String str8 = this.A03;
                0qQ.A0B(str8, 0);
                Map map = r32.A00;
                Boolean bool = (Boolean) map.get(str8);
                if (bool == null || !bool.booleanValue()) {
                    ((0sP) this.A01).invoke(obj);
                    map.put(str8, true);
                    r42.A00(r32);
                    break;
                }
            default:
                String str9 = (String) obj;
                0qQ.A0B(str9, 0);
                String str10 = this.A03;
                Object obj4 = this.A01;
                0qQ.A0B(str10, 1);
                0qQ.A0B(obj4, 2);
                AnonymousClass2UU.A00(new C283665Is(str9, obj4, str10));
                break;
        }
        lightweightQuickPerformanceLogger.markerPoint(i2, i3, this.A03);
        return C60340gF.A00;
    }
}
