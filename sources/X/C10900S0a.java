package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.S0a  reason: case insensitive filesystem */
public final class C10900S0a {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(TUQ.A00);

    public final C8294Qna A00(S4g s4g, S1I s1i, SJK sjk) {
        0qQ.A0B(s1i, 2);
        try {
            String str = null;
            C12110Sn5 sn5 = (C12110Sn5) C11057S8c.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
            ImmutableList immutableList = sjk.A01;
            2IS r4 = sn5.A00;
            r4.A05("component_types", immutableList);
            sn5.A02 = true;
            String str2 = sjk.A0F;
            2IS r2 = sn5.A01;
            r2.A04(Py7.A00(), str2);
            sn5.A06 = true;
            r2.A04(TraceFieldType.RequestID, sjk.A0E);
            sn5.A05 = true;
            r4.A04("payment_product_id", sjk.A0C);
            sn5.A04 = true;
            r2.A04("fetch_type", sjk.A09);
            sn5.A03 = true;
            OtcInput otcInput = sjk.A04;
            String str3 = null;
            if (otcInput != null) {
                str = otcInput.A00;
            }
            r4.A04("otc_session_id", str);
            if (otcInput != null) {
                str3 = otcInput.A01;
            }
            r4.A04("otc_type", str3);
            String str4 = sjk.A0D;
            if (!(str4 == null || str4.length() == 0)) {
                r2.A04("receiver_id", str4);
            }
            String str5 = sjk.A0B;
            if (str5.length() > 0) {
                r4.A04("payment_container_mode", str5);
            }
            ImmutableList immutableList2 = sjk.A06;
            if (!immutableList2.isEmpty()) {
                r2.A05("supported_container_types", immutableList2);
            }
            ImmutableList immutableList3 = sjk.A05;
            if (!immutableList3.isEmpty()) {
                r2.A05("payment_action_types", immutableList3);
            }
            String str6 = sjk.A07;
            if (!(str6 == null || str6.length() == 0)) {
                r2.A04("client_receiver_id", str6);
            }
            String str7 = sjk.A08;
            if (str7 != null) {
                r2.A04("experience_type", str7);
            }
            2IV r1 = sjk.A02;
            if (r1 != null) {
                r2.A00(r1, "charge_amount");
            }
            String str8 = sjk.A0A;
            if (str8 != null && !00l.A0W(str8)) {
                r2.A04("order_id", str8);
            }
            2IV r12 = sjk.A03;
            if (r12 != null) {
                r4.A00(r12, "otc_component_input");
            }
            2IV r13 = sjk.A00;
            if (r13 != null) {
                r2.A00(r13, "bloks_params");
            }
            1Ef build = sn5.build();
            0qQ.A0A(build);
            s1i.A00(build);
            return C8294Qna.A00(s4g, (1vo) this.A00.getValue(), build, C12601Sza.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
