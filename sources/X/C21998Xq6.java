package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.systrace.SystraceMessage;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Xq6  reason: case insensitive filesystem */
public final class C21998Xq6 {
    public final S17 A00;
    public final AnonymousClass46C A01;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.46D, java.lang.Object] */
    public static void A00(HyperThriftBase hyperThriftBase, C21998Xq6 xq6, String str) {
        SystraceMessage.A00(SystraceMessage.A00, "HyperThriftWriter.write", 4).A00(str, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        try {
            AnonymousClass50J A002 = xq6.A00.A00(str);
            Object[] objArr = hyperThriftBase.A01;
            AnonymousClass46C r11 = xq6.A01;
            r11.A0U(new Object());
            C21412XaL[] xaLArr = A002.A02;
            int length = xaLArr.length;
            for (int i = 0; i < length; i++) {
                C21412XaL xaL = xaLArr[i];
                Object obj = objArr[i];
                if (!(obj == null || obj == HyperThriftBase.A02)) {
                    String str2 = xaL.A01;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C21427Xac xac = xaL.A00;
                    r11.A0Q(new AnonymousClass46E(str2, XUw.A00(xac.A00), xaL.A02));
                    A01(xq6, xac, obj);
                }
            }
            r11.A0J();
            r11.A0K();
        } finally {
            0fc.A00(4, -133026028);
        }
    }

    public static void A01(C21998Xq6 xq6, C21427Xac xac, Object obj) {
        switch (xac.A00) {
            case 2:
                xq6.A01.A0X(((Boolean) obj).booleanValue());
                return;
            case 3:
                xq6.A01.A0L(((Number) obj).byteValue());
                return;
            case 4:
                xq6.A01.A0M(((Number) obj).doubleValue());
                return;
            case 6:
                xq6.A01.A0W(((Number) obj).shortValue());
                return;
            case 8:
            case 16:
                xq6.A01.A0O(AnonymousClass7TE.A0M(obj));
                return;
            case 10:
                xq6.A01.A0P(AnonymousClass7TE.A0R(obj));
                return;
            case 11:
                xq6.A01.A0V((String) obj);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A00((HyperThriftBase) obj, xq6, xac.A03);
                return;
            case 13:
                AbstractMap abstractMap = (AbstractMap) obj;
                int size = abstractMap.size();
                AnonymousClass46C r5 = xq6.A01;
                C21427Xac xac2 = xac.A01;
                byte A002 = XUw.A00(xac2.A00);
                C21427Xac xac3 = xac.A02;
                r5.A0S(new C21967Xmy(A002, XUw.A00(xac3.A00), size));
                Iterator A0s = AnonymousClass7TF.A0s(abstractMap);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    A01(xq6, xac2, A1J.getKey());
                    A01(xq6, xac3, A1J.getValue());
                }
                return;
            case 14:
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                int size2 = abstractCollection.size();
                AnonymousClass46C r3 = xq6.A01;
                C21427Xac xac4 = xac.A01;
                r3.A0T(new C21962Xmr(size2, XUw.A00(xac4.A00)));
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    A01(xq6, xac4, it.next());
                }
                return;
            case 15:
                AbstractList abstractList = (AbstractList) obj;
                int size3 = abstractList.size();
                AnonymousClass46C r32 = xq6.A01;
                C21427Xac xac5 = xac.A01;
                r32.A0R(new C21961Xmq(size3, XUw.A00(xac5.A00)));
                for (int i = 0; i < size3; i++) {
                    A01(xq6, xac5, abstractList.get(i));
                }
                return;
            case 19:
                xq6.A01.A0N(((Number) obj).floatValue());
                return;
            case 20:
                xq6.A01.A0Y((byte[]) obj);
                return;
            default:
                return;
        }
    }

    public C21998Xq6(S17 s17, AnonymousClass46C r2) {
        this.A00 = s17;
        this.A01 = r2;
    }
}
