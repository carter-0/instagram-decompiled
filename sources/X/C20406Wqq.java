package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Wqq  reason: case insensitive filesystem */
public final class C20406Wqq implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;

    public C20406Wqq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj) {
        C17912Vi3 vi3;
        int i;
        List list;
        switch (this.A00) {
            case 0:
                vi3 = (C17912Vi3) obj;
                AnonymousClass7TG.A1N(this.A01, vi3);
                list = 0sn.A00;
                i = 0;
                break;
            case 1:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) this.A01;
                vi3 = (C17912Vi3) obj;
                i = 0;
                AnonymousClass7TF.A1H(polymorphicSerializer, vi3);
                SerialDescriptor serialDescriptor = C255453u9.A00;
                0sn r4 = 0sn.A00;
                vi3.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4, serialDescriptor);
                vi3.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r4, C18700Vwy.A00(002.A0S("kotlinx.serialization.Polymorphic<", 0q1.A01(polymorphicSerializer.A01.A00), '>'), new C20417Wr1(), C2591640q.A00, new SerialDescriptor[0]));
                list = polymorphicSerializer.A00;
                break;
            case 2:
                C20803WzG wzG = (C20803WzG) this.A01;
                C17912Vi3 vi32 = (C17912Vi3) obj;
                AnonymousClass7TG.A1N(wzG, vi32);
                Iterator A0u = AnonymousClass7TF.A0u(wzG.A02);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    vi32.A00((String) A1J.getKey(), 0sn.A00, ((C255463uA) A1J.getValue()).getDescriptor());
                }
                break;
            case 3:
                C20803WzG wzG2 = (C20803WzG) this.A01;
                vi3 = (C17912Vi3) obj;
                i = 0;
                AnonymousClass7TF.A1H(wzG2, vi3);
                SerialDescriptor serialDescriptor2 = C255453u9.A00;
                0sn r5 = 0sn.A00;
                vi3.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5, serialDescriptor2);
                vi3.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r5, C18700Vwy.A00(002.A0S("kotlinx.serialization.Sealed<", 0q1.A01(wzG2.A04.A00), '>'), new C20406Wqq(wzG2, 2), C2591640q.A00, new SerialDescriptor[0]));
                list = wzG2.A00;
                break;
            case 4:
                C20441Wrj wrj = (C20441Wrj) this.A01;
                int A0M = AnonymousClass7TE.A0M(obj);
                return 002.A0g(wrj.A03[A0M], ": ", wrj.A04[A0M].BsV());
            default:
                C20431WrH wrH = (C20431WrH) this.A01;
                C17912Vi3 vi33 = (C17912Vi3) obj;
                AnonymousClass7TG.A1N(wrH, vi33);
                SerialDescriptor descriptor = wrH.A00.getDescriptor();
                0sn r2 = 0sn.A00;
                vi33.A00("first", r2, descriptor);
                vi33.A00("second", r2, wrH.A01.getDescriptor());
                vi33.A00("third", r2, wrH.A02.getDescriptor());
                break;
        }
        0qQ.A0B(list, i);
        vi3.A00 = list;
        return C60340gF.A00;
    }
}
