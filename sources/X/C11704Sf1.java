package X;

import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.UUID;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Sf1  reason: case insensitive filesystem */
public final class C11704Sf1 implements TZY {
    public static final int[] A02 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final C10919S0w A03 = new C10919S0w(new C11678Seb());
    public static final C10919S0w A04 = new C10919S0w(new C11679Sec());
    public C13890TjD A00 = new Object();
    public ImmutableList A01;

    public static void A00(C11704Sf1 sf1, List list, int i) {
        Object obj;
        switch (i) {
            case 0:
                obj = new C11686Sej();
                break;
            case 1:
                obj = new C11687Sek();
                break;
            case 2:
                obj = new C11691Seo(0);
                break;
            case 3:
                obj = new C11693Seq(0);
                break;
            case 4:
                obj = A03.A00(AnonymousClass7TF.A1b(0));
                if (obj == null) {
                    obj = new C22107XvX(0);
                    break;
                }
                break;
            case 5:
                obj = new C11692Sep();
                break;
            case 6:
                C13890TjD tjD = sf1.A00;
                UUID uuid = C11696Set.A0v;
                obj = new C11696Set(new C11721SfI(), tjD, 0);
                break;
            case 7:
                obj = new C11694Ser(0);
                break;
            case 8:
                C13890TjD tjD2 = sf1.A00;
                SJM sjm = C11695Ses.A0X;
                list.add(new C11695Ses(tjD2, ImmutableList.of(), 0));
                obj = new C11697Seu(tjD2, 0);
                break;
            case 9:
                obj = new Object();
                break;
            case 10:
                obj = new C22103XvT();
                break;
            case 11:
                if (sf1.A01 == null) {
                    sf1.A01 = ImmutableList.of();
                }
                obj = new C22106XvW(new C21505XdL(), sf1.A00, new C11752Sfn(sf1.A01), 0);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                obj = new C22102XvS();
                break;
            case 14:
                obj = new C11690Sen(0);
                break;
            case 15:
                obj = A04.A00(new Object[0]);
                if (obj == null) {
                    return;
                }
                break;
            case 16:
                obj = new C22105XvV(sf1.A00, 0);
                break;
            case 17:
                obj = new C11681See();
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                obj = new C11684Seh();
                break;
            case 19:
                obj = new C11680Sed();
                break;
            case 20:
                obj = new C11683Seg();
                break;
            case 21:
                obj = new C11682Sef();
                break;
            default:
                return;
        }
        list.add(obj);
    }
}
