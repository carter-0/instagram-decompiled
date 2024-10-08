package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

@Deprecated(message = "use {@link AutofillLogger}")
public final class S5W {
    public final WeakReference A00;
    public final C270254gR A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.RRP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.RRP, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0064, code lost:
        if (r0 == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r14.equals(r0) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r14.equals(r0) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        if (r14.equals("PROMPTED_SAVE") != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ee, code lost:
        r1 = java.lang.String.valueOf(r6.A04);
        r0 = "presented_end_of_session";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        if (r14.equals("SUPPRESSED_AUTOMATIC_UPDATE") != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        r5.put("AUTOMATIC_CONTACT_UPDATE_V2_MC_ENABLED", java.lang.String.valueOf(r8.A04.A01()));
        r4 = (java.util.Map) r7.A0F.A00;
        r1 = X.Pxe.A0n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
        if (r4.containsKey(r1) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        r1 = X.Pxf.A0j(r1, r4);
        r0 = "SUPPRESS_NUX_QRT_EXPERIMENT_VERSION_ID";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0125, code lost:
        r5.put(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        if (r14.equals("DECLINED_AUTOFILL") != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        r0 = r11.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        if (r0 == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        if (r0.clone() == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        r0 = r11.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        if (r0 == null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r0 = (java.util.TreeSet) r0.clone();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0148, code lost:
        r5.put("fields_rendered_in_bottomsheet", X.C2612548w.A00(", ", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
        r5.put("has_valid_email", java.lang.String.valueOf(r11.A0U));
        r5.put("has_valid_phone_number", java.lang.String.valueOf(r11.A0V));
        r11 = X.SKH.A02(r7, r8.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0173, code lost:
        if ((!r11.isEmpty()) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0175, code lost:
        r0 = r11.get("supplemented_wallet_data_from_recent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
        if (r0 != null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017f, code lost:
        r5.put("supplemented_wallet_data_from_recent", r0);
        r0 = r11.get("supplemented_wallet_data_from_crossapp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0189, code lost:
        if (r0 == 0) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018b, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018c, code lost:
        r5.put("supplemented_wallet_data_from_crossapp", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0191, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.RRP A00(java.lang.String r14, boolean r15) {
        /*
            r13 = this;
            r12 = 0
            java.lang.ref.WeakReference r0 = r13.A00
            X.QKv r11 = X.Pxe.A0Q(r0)
            java.lang.String r10 = ""
            if (r11 != 0) goto L_0x0018
            X.AnonymousClass7TG.A1N(r14, r10)
            X.RRP r9 = new X.RRP
            r9.<init>()
            r9.A0I = r14
            r9.A0B = r10
        L_0x0017:
            return r9
        L_0x0018:
            X.4gR r8 = r13.A01
            X.RzL r7 = r8.A00
            X.Jvc r6 = r7.A0P
            java.lang.String r0 = r6.A02
            X.AnonymousClass7TG.A1N(r14, r0)
            X.RRP r9 = new X.RRP
            r9.<init>()
            r9.A0I = r14
            r9.A0B = r0
            java.lang.String r0 = "CONTACT_AUTOFILL"
            r9.A0H = r0
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "is_bloks_screen"
            r5.put(r0, r1)
            android.content.Context r0 = r7.A0Q
            java.lang.String r1 = X.C11234SGu.A00(r0)
            java.lang.String r0 = "family_device_id"
            r5.put(r0, r1)
            int r4 = r14.hashCode()
            r0 = -2017877686(0xffffffff87b9a14a, float:-2.7930503E-34)
            r3 = 1
            java.lang.String r2 = "ACCEPTED_AUTOFILL"
            if (r4 == r0) goto L_0x0193
            r0 = -1238602589(0xffffffffb62c6ca3, float:-2.5693232E-6)
            if (r4 == r0) goto L_0x012a
            r0 = -1099895954(0xffffffffbe70eb6e, float:-0.2352731)
            if (r4 != r0) goto L_0x0066
            java.lang.String r0 = "PROMPTED_AUTOFILL"
            boolean r0 = r14.equals(r0)
        L_0x0064:
            if (r0 != 0) goto L_0x0132
        L_0x0066:
            r0 = -1993895147(0xffffffff89279315, float:-2.0171051E-33)
            if (r4 == r0) goto L_0x00dd
            r0 = -1824420039(0xffffffff93418f39, float:-2.4430639E-27)
            if (r4 == r0) goto L_0x00e6
            r0 = -1796214034(0xffffffff94eff2ee, float:-2.4228652E-26)
            if (r4 == r0) goto L_0x00da
            r0 = -829929728(0xffffffffce884700, float:-1.14317722E9)
            if (r4 == r0) goto L_0x00d7
            r0 = -740189112(0xffffffffd3e19c48, float:-1.93797921E12)
            if (r4 == r0) goto L_0x00f8
            r0 = 1853236564(0x6e762554, float:1.904461E28)
            if (r4 != r0) goto L_0x008c
            java.lang.String r0 = "SUPPRESSED_UPDATE"
        L_0x0086:
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0100
        L_0x008c:
            boolean r0 = r14.equals(r2)
            if (r0 == 0) goto L_0x009b
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "does_form_need_address_fix"
            r5.put(r0, r1)
        L_0x009b:
            r9.A0K = r5
            X.JwI r0 = r7.A0D
            java.lang.String r0 = X.Pxk.A0H(r0)
            r9.A0J = r0
            X.JV5 r2 = r7.A0J
            java.lang.Object r0 = r2.A03
            X.RF6 r1 = X.RF6.OPT_IN
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r1)
            r9.A0N = r0
            java.lang.Object r0 = r2.A00
            if (r0 == r1) goto L_0x00b6
            r3 = 0
        L_0x00b6:
            r9.A0O = r3
            X.QP6 r0 = r7.A05
            java.lang.String r0 = r0.A06
            r9.A0A = r0
            X.1yd r0 = r8.A04
            java.util.LinkedHashMap r0 = X.SPo.A00(r7, r0)
            r9.A0L = r0
            java.util.LinkedHashMap r0 = X.RUQ.A00(r7)
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "suppress_strategy"
            r9.A01(r0, r1)
            return r9
        L_0x00d7:
            java.lang.String r0 = "SUPPRESSED_OVERWRITE"
            goto L_0x0086
        L_0x00da:
            java.lang.String r0 = "DECLINED_SAVE"
            goto L_0x00df
        L_0x00dd:
            java.lang.String r0 = "ACCEPTED_SAVE"
        L_0x00df:
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x00ee
            goto L_0x008c
        L_0x00e6:
            java.lang.String r0 = "PROMPTED_SAVE"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x008c
        L_0x00ee:
            boolean r0 = r6.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "presented_end_of_session"
            goto L_0x0125
        L_0x00f8:
            java.lang.String r0 = "SUPPRESSED_AUTOMATIC_UPDATE"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x008c
        L_0x0100:
            X.1yd r0 = r8.A04
            boolean r0 = r0.A01()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "AUTOMATIC_CONTACT_UPDATE_V2_MC_ENABLED"
            r5.put(r0, r1)
            X.JwI r0 = r7.A0F
            java.lang.Object r4 = r0.A00
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Integer r1 = X.Pxe.A0n()
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = X.Pxf.A0j(r1, r4)
            java.lang.String r0 = "SUPPRESS_NUX_QRT_EXPERIMENT_VERSION_ID"
        L_0x0125:
            r5.put(r0, r1)
            goto L_0x008c
        L_0x012a:
            java.lang.String r0 = "DECLINED_AUTOFILL"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x008c
        L_0x0132:
            java.util.TreeSet r0 = r11.A0P
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r0.clone()
            if (r0 == 0) goto L_0x0151
            java.lang.String r1 = ", "
            java.util.TreeSet r0 = r11.A0P
            if (r0 == 0) goto L_0x0191
            java.lang.Object r0 = r0.clone()
            java.util.TreeSet r0 = (java.util.TreeSet) r0
        L_0x0148:
            java.lang.String r1 = X.C2612548w.A00(r1, r0)
            java.lang.String r0 = "fields_rendered_in_bottomsheet"
            r5.put(r0, r1)
        L_0x0151:
            boolean r0 = r11.A0U
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_valid_email"
            r5.put(r0, r1)
            boolean r0 = r11.A0V
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_valid_phone_number"
            r5.put(r0, r1)
            X.1yd r0 = r8.A04
            java.util.Map r11 = X.SKH.A02(r7, r0)
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = "supplemented_wallet_data_from_recent"
            java.lang.Object r0 = r11.get(r1)
            if (r0 != 0) goto L_0x017f
            r0 = r10
        L_0x017f:
            r5.put(r1, r0)
            java.lang.String r1 = "supplemented_wallet_data_from_crossapp"
            java.lang.Object r0 = r11.get(r1)
            if (r0 == 0) goto L_0x018c
            r10 = r0
        L_0x018c:
            r5.put(r1, r10)
            goto L_0x0066
        L_0x0191:
            r0 = 0
            goto L_0x0148
        L_0x0193:
            boolean r0 = r14.equals(r2)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S5W.A00(java.lang.String, boolean):X.RRP");
    }

    public final void A01(Bundle bundle, Integer num, Integer num2) {
        String str;
        String A002 = RUH.A00(num);
        if (00l.A0d(A002, "SHOW_", false) && 00l.A0d(A002, "_DIALOG", false)) {
            String A0R = 002.A0R("SUPPRESSED_", 00p.A0g(00p.A0g(A002, "SHOW_", "", false), "_DIALOG", "", false));
            0qQ.A0B(A0R, 0);
            RRP A003 = A00(A0R, false);
            switch (num2.intValue()) {
                case 0:
                    str = "SuppressIndefinitely";
                    break;
                case 1:
                    str = "SuppressAndDeferToClose";
                    break;
                default:
                    str = "Ineligible";
                    break;
            }
            A003.A01("suppress_strategy_type", str);
            SRY.A00().A07(bundle, A003.A00().A01());
        }
    }

    public final void A02(Bundle bundle, Integer num, String str) {
        String str2;
        RRP A002 = A00("NO_PROMPTED_AUTOFILL", false);
        if (str != null) {
            A002.A0G = str;
        }
        switch (num.intValue()) {
            case 1:
                str2 = "INVALID_NONCE";
                break;
            case 2:
                str2 = "AUTOFILL_DISABLED";
                break;
            case 3:
                str2 = "SYSTEM_AUTOFILL_ONLY";
                break;
            case 4:
                str2 = "QRT_BLACKOUT";
                break;
            case 5:
                str2 = "USER_PREVIOUSLY_DECLINED_FOR_DOMAIN";
                break;
            default:
                str2 = "MISSING_RELEVANT_CONTACT_INFO";
                break;
        }
        A002.A01(002.A0R("NO_AUTOFILL_PROMPT_REASON_", str2), str2);
        SRY.A00().A07(bundle, A002.A00().A01());
    }

    public S5W(C270254gR r1, WeakReference weakReference) {
        this.A01 = r1;
        this.A00 = weakReference;
    }
}
