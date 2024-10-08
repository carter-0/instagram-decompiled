package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Stn  reason: case insensitive filesystem */
public final class C12410Stn implements 2FO {
    public final S40 A00;

    public static C7529QHy A01(Long l, String str, String str2) {
        0bb r1 = new 0bb();
        r1.A06("contact_type", str);
        if (l != null) {
            r1.A05("contact_id", l);
        }
        if (str2 != null) {
            Pxe.A1T(r1, str2);
        }
        return r1;
    }

    public static QI0 A02(Long l) {
        0bb r1 = new 0bb();
        r1.A01(XST.A04, "credential_type");
        r1.A05("credential_id", l);
        return r1;
    }

    public static QI0 A03(Long l) {
        0bb r1 = new 0bb();
        r1.A01(XST.A02, "credential_type");
        r1.A05("credential_id", l);
        return r1;
    }

    public static QI0 A04(Long l, String str, String str2, String str3) {
        0bb r2 = new 0bb();
        r2.A01(XST.valueOf(str.toUpperCase(Locale.US)), "credential_type");
        if (l != null) {
            r2.A05("credential_id", l);
        }
        if (str2 != null) {
            Pxe.A1T(r2, str2);
        }
        if (str3 != null) {
            Pxe.A1S(r2, str3);
        }
        return r2;
    }

    public static QI8 A05(Long l) {
        0bb r1 = new 0bb();
        r1.A05("credential_id", l);
        return r1;
    }

    public static QIR A06(String str) {
        0bb r1 = new 0bb();
        Enum A002 = RV4.A00(RIT.class, str);
        A002.getClass();
        r1.A01((RIT) A002, "legal_info_type");
        return r1;
    }

    public static C7546QIp A07(Map map) {
        Object obj = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        obj.getClass();
        0bb r1 = new 0bb();
        r1.A05("shipping_address_id", (Long) obj);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r16v3 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: type inference failed for: r16v5 */
    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r16v7 */
    /* JADX WARNING: type inference failed for: r16v8 */
    /* JADX WARNING: type inference failed for: r16v9 */
    /* JADX WARNING: type inference failed for: r16v10 */
    /* JADX WARNING: type inference failed for: r16v11 */
    /* JADX WARNING: type inference failed for: r16v12 */
    /* JADX WARNING: type inference failed for: r16v13 */
    /* JADX WARNING: type inference failed for: r16v14 */
    /* JADX WARNING: type inference failed for: r16v15 */
    /* JADX WARNING: type inference failed for: r16v16 */
    /* JADX WARNING: type inference failed for: r16v17 */
    /* JADX WARNING: type inference failed for: r16v18 */
    /* JADX WARNING: type inference failed for: r16v19 */
    /* JADX WARNING: type inference failed for: r16v20 */
    /* JADX WARNING: type inference failed for: r16v21 */
    /* JADX WARNING: type inference failed for: r16v22 */
    /* JADX WARNING: type inference failed for: r16v23 */
    /* JADX WARNING: type inference failed for: r16v24 */
    /* JADX WARNING: type inference failed for: r16v25 */
    /* JADX WARNING: type inference failed for: r16v26 */
    /* JADX WARNING: type inference failed for: r16v27 */
    /* JADX WARNING: type inference failed for: r16v28 */
    /* JADX WARNING: type inference failed for: r16v29 */
    /* JADX WARNING: type inference failed for: r16v30 */
    /* JADX WARNING: type inference failed for: r16v31 */
    /* JADX WARNING: type inference failed for: r16v32 */
    /* JADX WARNING: type inference failed for: r16v33 */
    /* JADX WARNING: type inference failed for: r16v34 */
    /* JADX WARNING: type inference failed for: r16v35 */
    /* JADX WARNING: type inference failed for: r16v36 */
    /* JADX WARNING: type inference failed for: r16v37 */
    /* JADX WARNING: type inference failed for: r16v38 */
    /* JADX WARNING: type inference failed for: r16v39 */
    /* JADX WARNING: type inference failed for: r16v40 */
    /* JADX WARNING: type inference failed for: r16v41 */
    /* JADX WARNING: type inference failed for: r16v42 */
    /* JADX WARNING: type inference failed for: r16v43 */
    /* JADX WARNING: type inference failed for: r16v44 */
    /* JADX WARNING: type inference failed for: r16v45 */
    /* JADX WARNING: type inference failed for: r16v46 */
    /* JADX WARNING: type inference failed for: r16v47 */
    /* JADX WARNING: type inference failed for: r16v48 */
    /* JADX WARNING: type inference failed for: r16v49 */
    /* JADX WARNING: type inference failed for: r16v50 */
    /* JADX WARNING: type inference failed for: r16v51 */
    /* JADX WARNING: type inference failed for: r16v52 */
    /* JADX WARNING: type inference failed for: r16v53 */
    /* JADX WARNING: type inference failed for: r16v54 */
    /* JADX WARNING: type inference failed for: r16v55 */
    /* JADX WARNING: type inference failed for: r16v56 */
    /* JADX WARNING: type inference failed for: r16v57 */
    /* JADX WARNING: type inference failed for: r16v58 */
    /* JADX WARNING: type inference failed for: r16v59 */
    /* JADX WARNING: type inference failed for: r16v60 */
    /* JADX WARNING: type inference failed for: r16v61 */
    /* JADX WARNING: type inference failed for: r16v62 */
    /* JADX WARNING: type inference failed for: r16v63 */
    /* JADX WARNING: type inference failed for: r16v64 */
    /* JADX WARNING: type inference failed for: r16v65 */
    /* JADX WARNING: type inference failed for: r16v66 */
    /* JADX WARNING: type inference failed for: r16v67 */
    /* JADX WARNING: type inference failed for: r16v68 */
    /* JADX WARNING: type inference failed for: r16v69 */
    /* JADX WARNING: type inference failed for: r16v70 */
    /* JADX WARNING: type inference failed for: r16v71 */
    /* JADX WARNING: type inference failed for: r16v72 */
    /* JADX WARNING: type inference failed for: r16v73 */
    /* JADX WARNING: type inference failed for: r16v74 */
    /* JADX WARNING: type inference failed for: r16v75 */
    /* JADX WARNING: type inference failed for: r16v76 */
    /* JADX WARNING: type inference failed for: r16v77 */
    /* JADX WARNING: type inference failed for: r16v78 */
    /* JADX WARNING: type inference failed for: r16v79 */
    /* JADX WARNING: type inference failed for: r16v80 */
    /* JADX WARNING: type inference failed for: r16v81 */
    /* JADX WARNING: type inference failed for: r16v82 */
    /* JADX WARNING: type inference failed for: r16v83 */
    /* JADX WARNING: type inference failed for: r16v84 */
    /* JADX WARNING: type inference failed for: r16v85 */
    /* JADX WARNING: type inference failed for: r16v86 */
    /* JADX WARNING: type inference failed for: r16v87 */
    /* JADX WARNING: type inference failed for: r16v88 */
    /* JADX WARNING: type inference failed for: r16v89 */
    /* JADX WARNING: type inference failed for: r16v90 */
    /* JADX WARNING: type inference failed for: r16v91 */
    /* JADX WARNING: type inference failed for: r16v92 */
    /* JADX WARNING: type inference failed for: r16v93 */
    /* JADX WARNING: type inference failed for: r16v94 */
    /* JADX WARNING: type inference failed for: r16v95 */
    /* JADX WARNING: type inference failed for: r16v96 */
    /* JADX WARNING: type inference failed for: r16v97 */
    /* JADX WARNING: type inference failed for: r16v98 */
    /* JADX WARNING: type inference failed for: r16v99 */
    /* JADX WARNING: type inference failed for: r16v100 */
    /* JADX WARNING: type inference failed for: r16v101 */
    /* JADX WARNING: type inference failed for: r16v102 */
    /* JADX WARNING: type inference failed for: r16v103 */
    /* JADX WARNING: type inference failed for: r16v104 */
    /* JADX WARNING: type inference failed for: r16v105 */
    /* JADX WARNING: type inference failed for: r16v106 */
    /* JADX WARNING: type inference failed for: r16v107 */
    /* JADX WARNING: type inference failed for: r16v108 */
    /* JADX WARNING: type inference failed for: r16v109 */
    /* JADX WARNING: type inference failed for: r16v110 */
    /* JADX WARNING: type inference failed for: r16v111 */
    /* JADX WARNING: type inference failed for: r16v112 */
    /* JADX WARNING: type inference failed for: r16v113 */
    /* JADX WARNING: type inference failed for: r16v114 */
    /* JADX WARNING: type inference failed for: r16v115 */
    /* JADX WARNING: type inference failed for: r16v116 */
    /* JADX WARNING: type inference failed for: r16v117 */
    /* JADX WARNING: type inference failed for: r16v118 */
    /* JADX WARNING: type inference failed for: r16v119 */
    /* JADX WARNING: type inference failed for: r16v120 */
    /* JADX WARNING: type inference failed for: r16v121 */
    /* JADX WARNING: type inference failed for: r16v122 */
    /* JADX WARNING: type inference failed for: r16v123 */
    /* JADX WARNING: type inference failed for: r16v124 */
    /* JADX WARNING: type inference failed for: r16v125 */
    /* JADX WARNING: type inference failed for: r16v126 */
    /* JADX WARNING: type inference failed for: r16v127 */
    /* JADX WARNING: type inference failed for: r16v128 */
    /* JADX WARNING: type inference failed for: r16v129 */
    /* JADX WARNING: type inference failed for: r16v130 */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0507, code lost:
        r2.A06("target_name", r0);
        r1 = X.C51969G9p.A0d(r1.A00, "user_remove_credential_exit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0517, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0519, code lost:
        X.Pxe.A1Q(r1, r2);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x051f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0529, code lost:
        r1 = X.C51969G9p.A0d(r2.A00.A00, "client_edit_contact_success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0537, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0539, code lost:
        X.Pxe.A1Q(r1, r3);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x053f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0559, code lost:
        r1 = X.C51969G9p.A0d(r2.A00.A00, "user_edit_contact_submit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0568, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x056a, code lost:
        X.Pxe.A1Q(r1, r3);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0570, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x057f, code lost:
        r4.A01(r2, "default_credential_type");
        r2 = X.C51969G9p.A0d(r5.A00, "client_edit_defaultcredential_fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0590, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0592, code lost:
        X.JTU.A0t(X.Pxg.A0P(r1, r2, X.Py7.A00(), r3), r2, r4);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x05a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x05cf, code lost:
        r1 = X.C51969G9p.A0d(r1.A00, "user_edit_credential_submit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x05dc, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x05de, code lost:
        X.Pxe.A1Q(r1, r2);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x05e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x07b3, code lost:
        r3.A06("target_name", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x07e9, code lost:
        r3.A06("target_name", r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x07ec, code lost:
        r1 = r1.A00;
        r0 = "user_add_credential_enter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x07f1, code lost:
        r2 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x07f9, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x07fb, code lost:
        X.Pxe.A1Q(r2, r3);
        r2.AAJ(r4, X.AnonymousClass2M6.A00);
        r2.AAJ("product_type", X.AnonymousClass2MT.A00);
        r2.AAJ("platform", "android");
        r2.A9F("actual_event_time", X.C51968G9o.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0843, code lost:
        r1 = X.C51969G9p.A0d(r2.A00.A00, "user_remove_contact_enter");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0852, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0854, code lost:
        X.Pxe.A1Q(r1, r3);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x085a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x08eb, code lost:
        r2.A01(r0, "credential_type");
        r2.A05("credential_id", r3);
        r1 = X.C51969G9p.A0d(r1.A00, "client_remove_credential_success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x08ff, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0901, code lost:
        X.Pxe.A1Q(r1, r2);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0907, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0911, code lost:
        r2.A01(r0, "credential_type");
        r1 = X.C51969G9p.A0d(r1.A00, "client_add_credential_fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0920, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0922, code lost:
        X.Pxe.A1Q(r1, r2);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0928, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0999, code lost:
        r2 = A04(r3, r1, (java.lang.String) null, (java.lang.String) null);
        r1 = X.C51969G9p.A0d(r4.A00, "client_add_credential_success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x09aa, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x09ac, code lost:
        X.Pxe.A1Q(r1, r2);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x09b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x09e1, code lost:
        r2 = X.C51969G9p.A0d(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x09e9, code lost:
        if (r2.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x09eb, code lost:
        X.JTU.A0t(X.Pxg.A0P(r1, r2, r4, r3), r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x09f2, code lost:
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x09f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0a51, code lost:
        r1 = r2.A00.A00;
        r0 = "client_remove_contact_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0a6b, code lost:
        r1 = r2.A00;
        r0 = "user_remove_credential_enter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0a70, code lost:
        r1 = X.C51969G9p.A0d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0a78, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0a7a, code lost:
        X.Pxe.A1Q(r1, r3);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0a80, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x018d, code lost:
        r1 = r2.A00.A00;
        r0 = "client_remove_contact_fail";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01c9, code lost:
        r1 = r2.A00.A00;
        r0 = "user_remove_contact_cancel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02cd, code lost:
        r1 = r2.A00.A00;
        r0 = "client_add_contact_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x120a, code lost:
        r2.A06("view_name", r15);
        X.Pxk.A0W(X.C51969G9p.A0d(r1.A00, "client_load_credential_success"), r2, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x121a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x130b, code lost:
        r2.A06("target_name", r0);
        r4.A00(r1, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x1311, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0393, code lost:
        r5.A01(r2, "default_credential_type");
        r2 = r6.A00;
        r0 = "client_edit_defaultcredential_success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x03fd, code lost:
        r2.A01(r0, "credential_type");
        r2.A05("credential_id", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0405, code lost:
        r1 = X.C51969G9p.A0d(r4.A00, "client_remove_credential_fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0411, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0413, code lost:
        X.Pxe.A1Q(r1, r2);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0419, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0427, code lost:
        r2.A06("target_name", r0);
        r1 = X.C51969G9p.A0d(r1.A00, "user_remove_credential_submit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0437, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0439, code lost:
        X.Pxe.A1Q(r1, r2);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x043f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x046c, code lost:
        r1 = X.C51969G9p.A0d(r2.A00.A00, "client_add_contact_fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x047a, code lost:
        if (r1.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x047c, code lost:
        X.Pxe.A1Q(r1, r3);
        X.Pxk.A0V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0482, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgl(java.lang.String r27, java.util.Map r28) {
        /*
            r26 = this;
            r5 = r28
            r5.getClass()
            java.lang.String r4 = X.Py7.A00()
            java.lang.String r3 = A09(r4, r5)
            X.2M7 r1 = X.2M7.A03
            java.lang.String r6 = "product"
            boolean r0 = r5.containsKey(r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Class<X.2M7> r2 = X.2M7.class
            java.lang.String r0 = A09(r6, r5)
            X.2M7 r1 = X.2M7.A0K
            java.lang.Enum r0 = X.RV4.A00(r2, r0)
            if (r0 == 0) goto L_0x0027
            r1 = r0
        L_0x0027:
            X.2M7 r1 = (X.2M7) r1
        L_0x0029:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.AnonymousClass2M6.A00 = r3
            X.AnonymousClass2MQ.A00(r1)
            r16 = -1
            r2 = r27
            int r0 = r2.hashCode()
            switch(r0) {
                case -2079260116: goto L_0x0a81;
                case -2059230984: goto L_0x0a8d;
                case -1956265552: goto L_0x0a99;
                case -1892599704: goto L_0x0aa5;
                case -1729317994: goto L_0x0ab1;
                case -1672780296: goto L_0x0abd;
                case -1669344232: goto L_0x0aca;
                case -1488661434: goto L_0x0ad6;
                case -1402887998: goto L_0x0ae2;
                case -1383751873: goto L_0x0aef;
                case -1380694978: goto L_0x0afc;
                case -1349640606: goto L_0x0b08;
                case -1349252927: goto L_0x0b14;
                case -1296878591: goto L_0x0b20;
                case -1280394198: goto L_0x0b2c;
                case -1278635393: goto L_0x0b38;
                case -1235105309: goto L_0x0b44;
                case -1223435893: goto L_0x0b50;
                case -1222211672: goto L_0x0b5d;
                case -1202826582: goto L_0x0b6a;
                case -1166300159: goto L_0x0b76;
                case -1140898335: goto L_0x0b82;
                case -1116195793: goto L_0x0b8e;
                case -1112004113: goto L_0x0b9a;
                case -1071932498: goto L_0x0ba6;
                case -1017640239: goto L_0x0bb3;
                case -1017177312: goto L_0x0bc0;
                case -922082262: goto L_0x0bcd;
                case -921508661: goto L_0x0bd9;
                case -904920559: goto L_0x0be6;
                case -876529164: goto L_0x0bf2;
                case -865052097: goto L_0x0bff;
                case -860891980: goto L_0x0c0b;
                case -859606767: goto L_0x0c17;
                case -733416627: goto L_0x0c24;
                case -687868432: goto L_0x0c31;
                case -657184122: goto L_0x0c3e;
                case -580829748: goto L_0x0c4a;
                case -573578433: goto L_0x0c57;
                case -546547996: goto L_0x0c63;
                case -545346713: goto L_0x0c6f;
                case -516283000: goto L_0x0c7c;
                case -495059705: goto L_0x0c88;
                case -483686284: goto L_0x0c94;
                case -471261953: goto L_0x0ca0;
                case -433054293: goto L_0x0cad;
                case -432653470: goto L_0x0cb9;
                case -423810144: goto L_0x0cc5;
                case -407827867: goto L_0x0cd1;
                case -407440188: goto L_0x0cdd;
                case -375359241: goto L_0x0ce9;
                case -335600202: goto L_0x0cf6;
                case -237044648: goto L_0x0d02;
                case -158857220: goto L_0x0d0f;
                case -139437399: goto L_0x0d1b;
                case -138634896: goto L_0x0d27;
                case -133110930: goto L_0x0d33;
                case -124324968: goto L_0x0d40;
                case -10242882: goto L_0x0d4c;
                case 42047902: goto L_0x0d58;
                case 44000729: goto L_0x0d64;
                case 82014619: goto L_0x0d70;
                case 127833653: goto L_0x0d7c;
                case 143712189: goto L_0x0d88;
                case 199765843: goto L_0x0d94;
                case 202346795: goto L_0x0da1;
                case 202734474: goto L_0x0dad;
                case 209484900: goto L_0x0db9;
                case 239794977: goto L_0x0dc5;
                case 285575572: goto L_0x0dd1;
                case 292863669: goto L_0x0ddd;
                case 294723576: goto L_0x0dea;
                case 403826077: goto L_0x0df6;
                case 460108945: goto L_0x0e03;
                case 472693638: goto L_0x0e10;
                case 491541880: goto L_0x0e1c;
                case 496889969: goto L_0x0e29;
                case 502046982: goto L_0x0e35;
                case 555771726: goto L_0x0e41;
                case 557659136: goto L_0x0e4e;
                case 641960695: goto L_0x0e5b;
                case 658879254: goto L_0x0e67;
                case 682827319: goto L_0x0e73;
                case 737740693: goto L_0x0e80;
                case 802072808: goto L_0x0e8c;
                case 822643493: goto L_0x0e98;
                case 824493063: goto L_0x0ea4;
                case 896792218: goto L_0x0eb0;
                case 950441902: goto L_0x0ebc;
                case 1011441652: goto L_0x0ec8;
                case 1062730846: goto L_0x0ed4;
                case 1088994128: goto L_0x0ee1;
                case 1108371140: goto L_0x0eed;
                case 1126246190: goto L_0x0ef9;
                case 1202710340: goto L_0x0f05;
                case 1235841421: goto L_0x0f11;
                case 1238233860: goto L_0x0f1d;
                case 1269676926: goto L_0x0f2a;
                case 1286870649: goto L_0x0f36;
                case 1409624719: goto L_0x0f42;
                case 1419293762: goto L_0x0f4f;
                case 1429746583: goto L_0x0f5b;
                case 1434428437: goto L_0x0f67;
                case 1437968452: goto L_0x0f73;
                case 1440873864: goto L_0x0f7f;
                case 1479702967: goto L_0x0f8b;
                case 1488928148: goto L_0x0f97;
                case 1493773589: goto L_0x0fa3;
                case 1558106153: goto L_0x0faf;
                case 1560051838: goto L_0x0fbb;
                case 1632902204: goto L_0x0fc7;
                case 1633289883: goto L_0x0fd3;
                case 1646334247: goto L_0x0fdf;
                case 1679496565: goto L_0x0feb;
                case 1704795607: goto L_0x0ff7;
                case 1815851916: goto L_0x1003;
                case 1833286085: goto L_0x1010;
                case 1845027473: goto L_0x101c;
                case 1882193773: goto L_0x1028;
                case 1947910333: goto L_0x1034;
                case 1970065401: goto L_0x1041;
                case 1982946812: goto L_0x104e;
                case 1990882326: goto L_0x105a;
                case 2008337727: goto L_0x1066;
                case 2025710271: goto L_0x1073;
                case 2028877696: goto L_0x107f;
                case 2114271780: goto L_0x108b;
                case 2128639703: goto L_0x1098;
                case 2132710189: goto L_0x10a5;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.String r25 = "set_default_payment"
            java.lang.String r15 = "add_card"
            java.lang.String r24 = "payment_activity"
            java.lang.String r23 = "fbpay_hub"
            java.lang.String r22 = "transaction_id"
            java.lang.String r21 = "recurring_payments"
            java.lang.String r20 = "recurring_receipt"
            java.lang.String r19 = "edit_shipping_address"
            java.lang.String r18 = "add_shipping_address"
            r0 = 1671(0x687, float:2.342E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r0)
            java.lang.String r14 = "target_url"
            java.lang.String r13 = "data"
            java.lang.String r12 = "legal_info_type"
            java.lang.String r11 = "currency_code"
            java.lang.String r6 = "view_name"
            java.lang.String r10 = "email"
            java.lang.String r9 = "phone"
            java.lang.String r8 = "credential_type"
            java.lang.String r7 = "target_name"
            java.lang.String r0 = "id"
            r2 = r26
            switch(r16) {
                case 0: goto L_0x0133;
                case 1: goto L_0x1129;
                case 2: goto L_0x1155;
                case 3: goto L_0x1169;
                case 4: goto L_0x0140;
                case 5: goto L_0x0163;
                case 6: goto L_0x017a;
                case 7: goto L_0x0184;
                case 8: goto L_0x0195;
                case 9: goto L_0x01a6;
                case 10: goto L_0x01be;
                case 11: goto L_0x01d2;
                case 12: goto L_0x01e1;
                case 13: goto L_0x01f0;
                case 14: goto L_0x0078;
                case 15: goto L_0x10b1;
                case 16: goto L_0x0208;
                case 17: goto L_0x0214;
                case 18: goto L_0x022e;
                case 19: goto L_0x0248;
                case 20: goto L_0x0258;
                case 21: goto L_0x0267;
                case 22: goto L_0x02b7;
                case 23: goto L_0x117d;
                case 24: goto L_0x1191;
                case 25: goto L_0x02d5;
                case 26: goto L_0x0087;
                case 27: goto L_0x02e5;
                case 28: goto L_0x0098;
                case 29: goto L_0x02f3;
                case 30: goto L_0x0307;
                case 31: goto L_0x00a9;
                case 32: goto L_0x031d;
                case 33: goto L_0x033c;
                case 34: goto L_0x10c6;
                case 35: goto L_0x0356;
                case 36: goto L_0x036e;
                case 37: goto L_0x0385;
                case 38: goto L_0x039e;
                case 39: goto L_0x11ac;
                case 40: goto L_0x03ae;
                case 41: goto L_0x03c4;
                case 42: goto L_0x03d0;
                case 43: goto L_0x00b8;
                case 44: goto L_0x03db;
                case 45: goto L_0x00c7;
                case 46: goto L_0x00d6;
                case 47: goto L_0x11b9;
                case 48: goto L_0x03f0;
                case 49: goto L_0x041a;
                case 50: goto L_0x0440;
                case 51: goto L_0x0462;
                case 52: goto L_0x0483;
                case 53: goto L_0x0493;
                case 54: goto L_0x00e5;
                case 55: goto L_0x04b7;
                case 56: goto L_0x04c1;
                case 57: goto L_0x04e6;
                case 58: goto L_0x04fa;
                case 59: goto L_0x0520;
                case 60: goto L_0x11da;
                case 61: goto L_0x0540;
                case 62: goto L_0x054f;
                case 63: goto L_0x10de;
                case 64: goto L_0x0571;
                case 65: goto L_0x05a1;
                case 66: goto L_0x05c0;
                case 67: goto L_0x05e5;
                case 68: goto L_0x0619;
                case 69: goto L_0x11e6;
                case 70: goto L_0x0628;
                case 71: goto L_0x11f1;
                case 72: goto L_0x063e;
                case 73: goto L_0x065b;
                case 74: goto L_0x0673;
                case 75: goto L_0x0685;
                case 76: goto L_0x00f4;
                case 77: goto L_0x069e;
                case 78: goto L_0x06bd;
                case 79: goto L_0x06d7;
                case 80: goto L_0x06f0;
                case 81: goto L_0x0710;
                case 82: goto L_0x072a;
                case 83: goto L_0x11fe;
                case 84: goto L_0x121b;
                case 85: goto L_0x073c;
                case 86: goto L_0x0087;
                case 87: goto L_0x075c;
                case 88: goto L_0x123f;
                case 89: goto L_0x0775;
                case 90: goto L_0x125c;
                case 91: goto L_0x0799;
                case 92: goto L_0x07a6;
                case 93: goto L_0x1281;
                case 94: goto L_0x07b8;
                case 95: goto L_0x07db;
                case 96: goto L_0x081e;
                case 97: goto L_0x0838;
                case 98: goto L_0x085b;
                case 99: goto L_0x10f6;
                case 100: goto L_0x0866;
                case 101: goto L_0x088a;
                case 102: goto L_0x12a6;
                case 103: goto L_0x08a6;
                case 104: goto L_0x0103;
                case 105: goto L_0x110f;
                case 106: goto L_0x063e;
                case 107: goto L_0x08bf;
                case 108: goto L_0x12be;
                case 109: goto L_0x08de;
                case 110: goto L_0x0908;
                case 111: goto L_0x0929;
                case 112: goto L_0x12d2;
                case 113: goto L_0x12ea;
                case 114: goto L_0x0950;
                case 115: goto L_0x0112;
                case 116: goto L_0x0960;
                case 117: goto L_0x0984;
                case 118: goto L_0x098f;
                case 119: goto L_0x09b3;
                case 120: goto L_0x09f6;
                case 121: goto L_0x1302;
                case 122: goto L_0x0628;
                case 123: goto L_0x0a1f;
                case 124: goto L_0x0a48;
                case 125: goto L_0x1312;
                case 126: goto L_0x0122;
                case 127: goto L_0x0a58;
                case 128: goto L_0x1322;
                default: goto L_0x0077;
            }
        L_0x0077:
            return
        L_0x0078:
            X.QIm r5 = new X.QIm
            r5.<init>()
            r0 = r21
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_recurringpayments_init"
            goto L_0x09e1
        L_0x0087:
            X.QIg r5 = new X.QIg
            r5.<init>()
            java.lang.String r0 = "payment_activity_see_all"
            X.0Ae r2 = A00(r5, r2, r7, r0)
            java.lang.String r0 = "user_click_paymentactivity_atomic"
            goto L_0x09e1
        L_0x0098:
            X.QIm r5 = new X.QIm
            r5.<init>()
            java.lang.String r0 = "recurring_payments_see_all"
            X.0Ae r2 = A00(r5, r2, r7, r0)
            java.lang.String r0 = "user_click_recurringpayments_atomic"
            goto L_0x09e1
        L_0x00a9:
            X.QIg r5 = new X.QIg
            r5.<init>()
            r0 = r24
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_paymentactivity_init"
            goto L_0x09e1
        L_0x00b8:
            X.QIg r5 = new X.QIg
            r5.<init>()
            r0 = r24
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_paymentactivity_success"
            goto L_0x09e1
        L_0x00c7:
            X.QIh r5 = new X.QIh
            r5.<init>()
            r0 = r17
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_paymentsettings_init"
            goto L_0x09e1
        L_0x00d6:
            X.QIK r5 = new X.QIK
            r5.<init>()
            r0 = r23
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_fbpayhubhome_init"
            goto L_0x09e1
        L_0x00e5:
            X.QIm r5 = new X.QIm
            r5.<init>()
            r0 = r21
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_recurringpayments_success"
            goto L_0x09e1
        L_0x00f4:
            X.QIK r5 = new X.QIK
            r5.<init>()
            r0 = r23
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_fbpayhubhome_success"
            goto L_0x09e1
        L_0x0103:
            X.QIh r5 = new X.QIh
            r5.<init>()
            r0 = r17
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_paymentsettings_success"
            goto L_0x09e1
        L_0x0112:
            X.QIh r5 = new X.QIh
            r5.<init>()
            r0 = r17
            X.0Ae r2 = A00(r5, r2, r7, r0)
            java.lang.String r0 = "user_click_paymentsettings_atomic"
            goto L_0x09e1
        L_0x0122:
            X.QHs r5 = new X.QHs
            r5.<init>()
            java.lang.String r0 = "manage_fbpay_info"
            X.0Ae r2 = A00(r5, r2, r7, r0)
            java.lang.String r0 = "user_click_accountlinking_atomic"
            goto L_0x09e1
        L_0x0133:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "remove_phone_cancel"
            X.QHy r3 = A01(r1, r9, r0)
            goto L_0x01c9
        L_0x0140:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "remove_phone_save"
            X.QHy r3 = A01(r1, r9, r0)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_remove_contact_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x0163:
            java.lang.Object r0 = X.C2818159r.A00(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            X.S40 r2 = r2.A00
            X.QI8 r5 = A05(r0)
            r0 = r25
            r5.A06(r6, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "client_load_defaultcredential_success"
            goto L_0x09e1
        L_0x017a:
            r1 = 0
            java.lang.Long r0 = A08(r0, r5)
            X.QHy r3 = A01(r0, r9, r1)
            goto L_0x018d
        L_0x0184:
            r1 = 0
            java.lang.Long r0 = A08(r0, r5)
            X.QHy r3 = A01(r0, r10, r1)
        L_0x018d:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_remove_contact_fail"
            goto L_0x07f1
        L_0x0195:
            java.lang.String r6 = A09(r7, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r3 = A04(r0, r3, r6, r0)
            goto L_0x07ec
        L_0x01a6:
            java.lang.String r6 = X.Pxh.A0n(r7, r5)
            java.lang.String r5 = X.Pxh.A0n(r12, r5)
            X.S40 r0 = r2.A00
            X.QIR r5 = A06(r5)
            r5.A06(r7, r6)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "user_edit_legalinfo_enter"
            goto L_0x09e1
        L_0x01be:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "remove_email_cancel"
            X.QHy r3 = A01(r1, r10, r0)
        L_0x01c9:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_remove_contact_cancel"
            goto L_0x07f1
        L_0x01d2:
            java.lang.Long r1 = A08(r0, r5)
            X.S40 r4 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A04
            goto L_0x03fd
        L_0x01e1:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = A02(r0)
            java.lang.String r0 = "remove_paypal_save"
            goto L_0x0427
        L_0x01f0:
            java.lang.Object r1 = X.Pxe.A0r(r13, r5)
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = r1.A07(r0)
            r0.getClass()
            java.lang.Long r1 = X.DbV.A0q(r0)
            r0 = 0
            X.QHy r3 = A01(r1, r9, r0)
            goto L_0x02cd
        L_0x0208:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "edit_email_save"
            X.QHy r3 = A01(r1, r10, r0)
            goto L_0x0559
        L_0x0214:
            java.lang.String r0 = X.Pxh.A0n(r11, r5)
            X.S40 r2 = r2.A00
            X.QI1 r5 = new X.QI1
            r5.<init>()
            r5.A06(r11, r0)
            java.lang.String r0 = "edit_currency"
            r5.A06(r7, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "user_edit_currency_enter"
            goto L_0x09e1
        L_0x022e:
            java.lang.Long r9 = A08(r0, r5)
            java.lang.String r6 = A09(r7, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r3 = A04(r9, r3, r6, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_click_credential_atomic"
            goto L_0x07f1
        L_0x0248:
            java.lang.String r5 = X.Pxh.A0n(r12, r5)
            X.S40 r0 = r2.A00
            X.QIR r5 = A06(r5)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "client_edit_legalinfo_success"
            goto L_0x09e1
        L_0x0258:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = A03(r0)
            java.lang.String r0 = "remove_card_cancel"
            goto L_0x0507
        L_0x0267:
            java.lang.String r10 = "referrer"
            java.lang.String r7 = X.DbU.A0r(r10, r5)
            java.lang.Class<X.EZN> r9 = X.EZN.class
            if (r7 == 0) goto L_0x02b4
            r0 = r7
        L_0x0273:
            X.EZN r8 = X.EZN.UNKNOWN
            java.lang.Enum r0 = X.RV4.A00(r9, r0)
            if (r0 == 0) goto L_0x027c
            r8 = r0
        L_0x027c:
            X.EZN r8 = (X.EZN) r8
            java.lang.String r0 = X.DbU.A0r(r6, r5)
            X.QIO r5 = new X.QIO
            r5.<init>()
            r5.A01(r8, r10)
            if (r0 == 0) goto L_0x028f
            r5.A06(r6, r0)
        L_0x028f:
            X.S40 r0 = r2.A00
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "client_load_fbpayhub_init"
            X.0Aj r2 = X.C51969G9p.A0d(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0077
            X.59v r0 = X.Pxg.A0P(r1, r2, r4, r3)
            X.JTU.A0t(r0, r2, r5)
            java.lang.String r0 = "raw_referrer"
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r7)
            java.lang.String r0 = "extra_data"
            r2.A9H(r0, r1)
            goto L_0x09f2
        L_0x02b4:
            java.lang.String r0 = ""
            goto L_0x0273
        L_0x02b7:
            java.lang.Object r1 = X.Pxe.A0r(r13, r5)
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = r1.A07(r0)
            r0.getClass()
            java.lang.Long r1 = X.DbV.A0q(r0)
            r0 = 0
            X.QHy r3 = A01(r1, r10, r0)
        L_0x02cd:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_add_contact_success"
            goto L_0x07f1
        L_0x02d5:
            java.lang.Object r0 = X.C2818159r.A00(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            X.S40 r6 = r2.A00
            X.QI8 r5 = A05(r0)
            X.RIc r2 = X.RIc.MESSENGER_P2P
            goto L_0x0393
        L_0x02e5:
            X.S40 r1 = r2.A00
            X.QI0 r3 = new X.QI0
            r3.<init>()
            X.XST r0 = X.XST.A02
            r3.A01(r0, r8)
            goto L_0x07e9
        L_0x02f3:
            java.lang.String r6 = X.Pxh.A0n(r11, r5)
            X.S40 r0 = r2.A00
            X.QI1 r5 = new X.QI1
            r5.<init>()
            r5.A06(r11, r6)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "client_edit_currency_success"
            goto L_0x09e1
        L_0x0307:
            java.lang.String r6 = A09(r7, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r3 = A04(r0, r3, r6, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_add_credential_exit"
            goto L_0x07f1
        L_0x031d:
            r1 = 0
            java.lang.String r0 = "add_email_save"
            X.QHy r3 = A01(r1, r10, r0)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_add_contact_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x033c:
            java.lang.Long r9 = X.Pxe.A0o(r0, r5)
            java.lang.String r6 = A09(r7, r5)
            java.lang.String r5 = A09(r8, r5)
            X.S40 r2 = r2.A00
            r0 = 0
            X.QI0 r5 = A04(r9, r5, r6, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "user_edit_credential_enter"
            goto L_0x09e1
        L_0x0356:
            java.lang.Object r0 = X.C2818159r.A00(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            X.S40 r2 = r2.A00
            X.QI8 r5 = A05(r0)
            r0 = r25
            r5.A06(r7, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "user_edit_defaultcredential_enter"
            goto L_0x09e1
        L_0x036e:
            java.lang.String r7 = X.Pxh.A0n(r6, r5)
            java.lang.String r5 = X.Pxh.A0n(r12, r5)
            X.S40 r0 = r2.A00
            X.QIR r5 = A06(r5)
            r5.A06(r6, r7)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "client_load_legalinfo_success"
            goto L_0x09e1
        L_0x0385:
            java.lang.Object r0 = X.C2818159r.A00(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            X.S40 r6 = r2.A00
            X.QI8 r5 = A05(r0)
            X.RIc r2 = X.RIc.CONSUMER
        L_0x0393:
            java.lang.String r0 = "default_credential_type"
            r5.A01(r2, r0)
            X.0Ae r2 = r6.A00
            java.lang.String r0 = "client_edit_defaultcredential_success"
            goto L_0x09e1
        L_0x039e:
            java.lang.Long r3 = X.Pxe.A0o(r0, r5)
            java.lang.String r1 = A09(r8, r5)
            X.S40 r4 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r3, r1, r0, r0)
            goto L_0x0405
        L_0x03ae:
            r3 = 0
            java.lang.String r1 = A09(r7, r5)
            java.lang.String r0 = A0A(r1)
            X.QHy r3 = A01(r3, r0, r1)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_add_contact_enter"
            goto L_0x07f1
        L_0x03c4:
            X.QHy r3 = new X.QHy
            r3.<init>()
            java.lang.String r0 = "contact_type"
            r3.A06(r0, r9)
            goto L_0x046c
        L_0x03d0:
            X.S40 r4 = r2.A00
            java.lang.Long r3 = X.Pxe.A0o(r0, r5)
            java.lang.String r1 = "paypal_ba"
            goto L_0x0999
        L_0x03db:
            java.lang.Long r6 = X.Pxe.A0o(r0, r5)
            java.lang.String r4 = A09(r7, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r6, r3, r4, r0)
            goto L_0x05cf
        L_0x03f0:
            java.lang.Long r1 = A08(r0, r5)
            X.S40 r4 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A02
        L_0x03fd:
            r2.A01(r0, r8)
            java.lang.String r0 = "credential_id"
            r2.A05(r0, r1)
        L_0x0405:
            X.0Ae r1 = r4.A00
            java.lang.String r0 = "client_remove_credential_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x041a:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = A03(r0)
            java.lang.String r0 = "remove_card_save"
        L_0x0427:
            r2.A06(r7, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_remove_credential_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0440:
            java.lang.Object r9 = X.C2818159r.A00(r7, r5)
            X.RIw r9 = (X.C8957RIw) r9
            java.lang.String r8 = "auth_factor_type"
            java.lang.Object r6 = X.C2818159r.A00(r8, r5)
            X.RIj r6 = (X.RIj) r6
            X.S40 r0 = r2.A00
            X.QHt r5 = new X.QHt
            r5.<init>()
            r5.A01(r6, r8)
            r5.A01(r9, r7)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "user_click_auth_atomic"
            goto L_0x09e1
        L_0x0462:
            X.QHy r3 = new X.QHy
            r3.<init>()
            java.lang.String r0 = "contact_type"
            r3.A06(r0, r10)
        L_0x046c:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_add_contact_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x0483:
            java.lang.Object r0 = X.C2818159r.A00(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            X.S40 r5 = r2.A00
            X.QI8 r4 = A05(r0)
            X.RIc r2 = X.RIc.MESSENGER_P2P
            goto L_0x057f
        L_0x0493:
            java.lang.Long r4 = X.Pxe.A0o(r0, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r4, r3, r0, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_edit_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x04b7:
            r1 = 0
            java.lang.Long r0 = A08(r0, r5)
            X.QHy r3 = A01(r0, r9, r1)
            goto L_0x0529
        L_0x04c1:
            java.lang.String r4 = A09(r7, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r0, r3, r4, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_add_credential_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x04e6:
            java.lang.String r6 = X.Pxh.A0n(r11, r5)
            X.S40 r0 = r2.A00
            X.QI1 r5 = new X.QI1
            r5.<init>()
            r5.A06(r11, r6)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "client_edit_currency_fail"
            goto L_0x09e1
        L_0x04fa:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = A02(r0)
            java.lang.String r0 = "remove_paypal_cancel"
        L_0x0507:
            r2.A06(r7, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_remove_credential_exit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0520:
            java.lang.Long r1 = A08(r0, r5)
            r0 = 0
            X.QHy r3 = A01(r1, r10, r0)
        L_0x0529:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_contact_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x0540:
            java.lang.Long r3 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A02
            goto L_0x08eb
        L_0x054f:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "edit_phone_save"
            X.QHy r3 = A01(r1, r9, r0)
        L_0x0559:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_edit_contact_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x0571:
            java.lang.Object r0 = X.C2818159r.A00(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            X.S40 r5 = r2.A00
            X.QI8 r4 = A05(r0)
            X.RIc r2 = X.RIc.CONSUMER
        L_0x057f:
            java.lang.String r0 = "default_credential_type"
            r4.A01(r2, r0)
            X.0Ae r2 = r5.A00
            java.lang.String r0 = "client_edit_defaultcredential_fail"
            X.0Aj r2 = X.C51969G9p.A0d(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = X.Py7.A00()
            X.59v r0 = X.Pxg.A0P(r1, r2, r0, r3)
            X.JTU.A0t(r0, r2, r4)
            r2.Cgf()
            return
        L_0x05a1:
            java.lang.Long r1 = A08(r0, r5)
            X.S40 r0 = r2.A00
            X.QI0 r2 = A03(r1)
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_credential_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x05c0:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = A03(r0)
            java.lang.String r0 = "edit_card_save"
            r2.A06(r7, r0)
        L_0x05cf:
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_edit_credential_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x05e5:
            java.lang.Object r1 = r5.get(r13)
            boolean r0 = r1 instanceof com.fbpay.hub.paymentmethods.api.FbPayCreditCard
            if (r0 == 0) goto L_0x0612
            com.fbpay.hub.paymentmethods.api.FbPayCreditCard r1 = (com.fbpay.hub.paymentmethods.api.FbPayCreditCard) r1
            java.lang.String r1 = r1.A06
        L_0x05f1:
            java.lang.Long r1 = X.DbV.A0q(r1)
            if (r1 == 0) goto L_0x0077
            X.S40 r0 = r2.A00
            X.QI0 r2 = A03(r1)
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_add_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0612:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x05f1
        L_0x0619:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r2 = r2.A00
            X.QI0 r3 = A03(r0)
            java.lang.String r0 = "remove_card"
            goto L_0x07b3
        L_0x0628:
            java.lang.String r0 = X.DbT.A11(r7, r5)
            if (r0 != 0) goto L_0x0630
            java.lang.String r0 = "contact_settings"
        L_0x0630:
            X.QHy r3 = new X.QHy
            r3.<init>()
            X.0Ae r1 = A00(r3, r2, r7, r0)
            java.lang.String r0 = "user_click_contact_atomic"
            goto L_0x07f1
        L_0x063e:
            r0 = r22
            java.lang.Long r6 = A08(r0, r5)
            X.QIl r5 = new X.QIl
            r5.<init>()
            java.lang.String r0 = "receipt_id"
            r5.A05(r0, r6)
            java.lang.String r0 = "receipt"
            X.0Ae r2 = A00(r5, r2, r7, r0)
            java.lang.String r0 = "user_click_receipt_atomic"
            goto L_0x09e1
        L_0x065b:
            java.lang.String r6 = X.Pxh.A0n(r7, r5)
            java.lang.String r5 = X.Pxh.A0n(r12, r5)
            X.S40 r0 = r2.A00
            X.QIR r5 = A06(r5)
            r5.A06(r7, r6)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "user_edit_legalinfo_submit"
            goto L_0x09e1
        L_0x0673:
            X.S40 r2 = r2.A00
            X.QIM r5 = new X.QIM
            r5.<init>()
            java.lang.String r0 = "fbpay_branding"
            r5.A06(r6, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "client_load_fbpaybranding_success"
            goto L_0x09e1
        L_0x0685:
            java.lang.Long r3 = A08(r0, r5)
            java.lang.String r1 = A09(r7, r5)
            java.lang.String r0 = A0A(r1)
            X.QHy r3 = A01(r3, r0, r1)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_edit_contact_enter"
            goto L_0x07f1
        L_0x069e:
            java.lang.String r1 = "add_phone_save"
            r0 = 0
            X.QHy r3 = A01(r0, r9, r1)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_add_contact_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x06bd:
            java.lang.String r6 = X.Pxh.A0n(r14, r5)
            X.S40 r2 = r2.A00
            X.QIM r5 = new X.QIM
            r5.<init>()
            java.lang.String r0 = "fbpay_branding_learn_more"
            r5.A06(r7, r0)
            r5.A06(r14, r6)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "user_click_fbpaybranding_atomic"
            goto L_0x09e1
        L_0x06d7:
            java.lang.Object r0 = X.C2818159r.A00(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            X.S40 r2 = r2.A00
            X.QI8 r5 = A05(r0)
            java.lang.String r0 = "set_default_payment_save"
            r5.A06(r7, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "user_edit_defaultcredential_submit"
            goto L_0x09e1
        L_0x06f0:
            java.lang.Long r1 = A08(r0, r5)
            r0 = 0
            X.QHy r3 = A01(r1, r9, r0)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_contact_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x0710:
            java.lang.String r0 = X.Pxh.A0n(r11, r5)
            X.S40 r2 = r2.A00
            X.QI1 r5 = new X.QI1
            r5.<init>()
            r5.A06(r11, r0)
            java.lang.String r0 = "edit_currency_save"
            r5.A06(r7, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "user_edit_currency_submit"
            goto L_0x09e1
        L_0x072a:
            java.lang.String r0 = A09(r6, r5)
            X.QIK r5 = new X.QIK
            r5.<init>()
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "user_click_fbpayhubhome_atomic"
            goto L_0x09e1
        L_0x073c:
            java.lang.Long r1 = A08(r0, r5)
            r0 = 0
            X.QHy r3 = A01(r1, r10, r0)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_contact_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x075c:
            java.lang.String r0 = X.Pxh.A0n(r11, r5)
            X.S40 r2 = r2.A00
            X.QI1 r5 = new X.QI1
            r5.<init>()
            r5.A06(r11, r0)
            java.lang.String r0 = "edit_currency"
            r5.A06(r6, r0)
            X.0Ae r2 = r2.A00
            java.lang.String r0 = "client_load_currency_success"
            goto L_0x09e1
        L_0x0775:
            java.lang.Long r4 = X.Pxe.A0o(r0, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r4, r3, r0, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_add_credential_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0799:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "remove_phone"
            X.QHy r3 = A01(r1, r9, r0)
            goto L_0x0843
        L_0x07a6:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r2 = r2.A00
            X.QI0 r3 = A02(r0)
            java.lang.String r0 = "remove_paypal"
        L_0x07b3:
            r3.A06(r7, r0)
            goto L_0x0a6b
        L_0x07b8:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "remove_email_save"
            X.QHy r3 = A01(r1, r10, r0)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_remove_contact_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x07db:
            X.S40 r1 = r2.A00
            X.QI0 r3 = new X.QI0
            r3.<init>()
            X.XST r0 = X.XST.A04
            r3.A01(r0, r8)
            java.lang.String r15 = "add_paypal"
        L_0x07e9:
            r3.A06(r7, r15)
        L_0x07ec:
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_add_credential_enter"
        L_0x07f1:
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r2, r3)
            java.lang.String r0 = X.AnonymousClass2M6.A00
            r2.AAJ(r4, r0)
            java.lang.String r1 = X.AnonymousClass2MT.A00
            java.lang.String r0 = "product_type"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "android"
            java.lang.String r0 = "platform"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = X.C51968G9o.A0u()
            java.lang.String r0 = "actual_event_time"
            r2.A9F(r0, r1)
            goto L_0x09f2
        L_0x081e:
            java.lang.Long r6 = A08(r0, r5)
            X.QIn r5 = new X.QIn
            r5.<init>()
            java.lang.String r0 = "recurring_receipt_id"
            r5.A05(r0, r6)
            r0 = r20
            X.0Ae r2 = A00(r5, r2, r7, r0)
            java.lang.String r0 = "user_click_recurringreceipt_atomic"
            goto L_0x09e1
        L_0x0838:
            java.lang.Long r1 = A08(r0, r5)
            java.lang.String r0 = "remove_email"
            X.QHy r3 = A01(r1, r10, r0)
        L_0x0843:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_remove_contact_enter"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x085b:
            X.S40 r1 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A04
            goto L_0x0911
        L_0x0866:
            java.lang.Long r4 = X.Pxe.A0o(r0, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r4, r3, r0, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_remove_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x088a:
            r0 = r22
            java.lang.Long r7 = A08(r0, r5)
            X.QIl r5 = new X.QIl
            r5.<init>()
            java.lang.String r0 = "receipt_id"
            r5.A05(r0, r7)
            java.lang.String r0 = "receipt_details"
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_receipt_success"
            goto L_0x09e1
        L_0x08a6:
            java.lang.Long r7 = A08(r0, r5)
            X.QIn r5 = new X.QIn
            r5.<init>()
            java.lang.String r0 = "recurring_receipt_id"
            r5.A05(r0, r7)
            r0 = r20
            X.0Ae r2 = A00(r5, r2, r6, r0)
            java.lang.String r0 = "client_load_recurringreceipt_success"
            goto L_0x09e1
        L_0x08bf:
            java.lang.Long r1 = A08(r0, r5)
            X.S40 r0 = r2.A00
            X.QI0 r2 = A03(r1)
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x08de:
            java.lang.Long r3 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A04
        L_0x08eb:
            r2.A01(r0, r8)
            java.lang.String r0 = "credential_id"
            r2.A05(r0, r3)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_remove_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0908:
            X.S40 r1 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A02
        L_0x0911:
            r2.A01(r0, r8)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_add_credential_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0929:
            X.S40 r1 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A02
            r2.A01(r0, r8)
            java.lang.String r0 = "add_card_save"
            r2.A06(r7, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_add_credential_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0950:
            java.lang.String r5 = X.Pxh.A0n(r12, r5)
            X.S40 r0 = r2.A00
            X.QIR r5 = A06(r5)
            X.0Ae r2 = r0.A00
            java.lang.String r0 = "client_edit_legalinfo_fail"
            goto L_0x09e1
        L_0x0960:
            r4 = 0
            java.lang.Long r3 = X.Pxe.A0o(r0, r5)
            java.lang.String r1 = A09(r8, r5)
            X.S40 r0 = r2.A00
            X.QI0 r2 = A04(r3, r1, r4, r4)
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_credential_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0984:
            r1 = 0
            java.lang.Long r0 = A08(r0, r5)
            X.QHy r3 = A01(r0, r9, r1)
            goto L_0x0a51
        L_0x098f:
            java.lang.Long r3 = X.Pxe.A0o(r0, r5)
            java.lang.String r1 = A09(r8, r5)
            X.S40 r4 = r2.A00
        L_0x0999:
            r0 = 0
            X.QI0 r2 = A04(r3, r1, r0, r0)
            X.0Ae r1 = r4.A00
            java.lang.String r0 = "client_add_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x09b3:
            java.lang.Object r10 = X.C2818159r.A00(r0, r5)
            java.lang.Long r10 = (java.lang.Long) r10
            java.lang.String r0 = X.Pxh.A0n(r7, r5)
            java.lang.String r9 = "default_credential_type"
            java.lang.String r8 = X.Pxh.A0n(r9, r5)
            X.S40 r6 = r2.A00
            X.QI8 r5 = A05(r10)
            r5.A06(r7, r0)
            java.lang.Class<X.RIc> r0 = X.RIc.class
            X.RIc r2 = X.RIc.CONSUMER
            java.lang.Enum r0 = X.RV4.A00(r0, r8)
            if (r0 == 0) goto L_0x09d7
            r2 = r0
        L_0x09d7:
            X.RIc r2 = (X.RIc) r2
            r5.A01(r2, r9)
            X.0Ae r2 = r6.A00
            java.lang.String r0 = "user_click_defaultcredential_atomic"
        L_0x09e1:
            X.0Aj r2 = X.C51969G9p.A0d(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0077
            X.59v r0 = X.Pxg.A0P(r1, r2, r4, r3)
            X.JTU.A0t(r0, r2, r5)
        L_0x09f2:
            r2.Cgf()
            return
        L_0x09f6:
            java.lang.Long r6 = X.Pxe.A0o(r0, r5)
            java.lang.String r4 = A09(r7, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r6, r3, r4, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_remove_credential_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0a1f:
            java.lang.Long r6 = X.Pxe.A0o(r0, r5)
            java.lang.String r4 = A09(r7, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r6, r3, r4, r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "user_remove_credential_exit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r2)
            X.Pxk.A0V(r1)
            return
        L_0x0a48:
            java.lang.Long r1 = A08(r0, r5)
            r0 = 0
            X.QHy r3 = A01(r1, r10, r0)
        L_0x0a51:
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_remove_contact_success"
            goto L_0x0a70
        L_0x0a58:
            java.lang.Long r4 = X.Pxe.A0o(r0, r5)
            java.lang.String r3 = A09(r7, r5)
            java.lang.String r1 = A09(r8, r5)
            X.S40 r2 = r2.A00
            r0 = 0
            X.QI0 r3 = A04(r4, r1, r3, r0)
        L_0x0a6b:
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "user_remove_credential_enter"
        L_0x0a70:
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0077
            X.Pxe.A1Q(r1, r3)
            X.Pxk.A0V(r1)
            return
        L_0x0a81:
            java.lang.String r0 = "fbpay_delete_phone_cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 0
            goto L_0x003d
        L_0x0a8d:
            java.lang.String r0 = "fbpay_add_shipping_address_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 1
            goto L_0x003d
        L_0x0a99:
            java.lang.String r0 = "fbpay_edit_shipping_address_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 2
            goto L_0x003d
        L_0x0aa5:
            java.lang.String r0 = "fbpay_delete_shipping_address_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 3
            goto L_0x003d
        L_0x0ab1:
            java.lang.String r0 = "fbpay_delete_phone_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 4
            goto L_0x003d
        L_0x0abd:
            java.lang.String r0 = "set_default_payment_method_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 5
            goto L_0x003d
        L_0x0aca:
            java.lang.String r0 = "fbpay_delete_phone_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 6
            goto L_0x003d
        L_0x0ad6:
            java.lang.String r0 = "fbpay_delete_email_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 7
            goto L_0x003d
        L_0x0ae2:
            java.lang.String r0 = "user_add_credential_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 8
            goto L_0x003d
        L_0x0aef:
            java.lang.String r0 = "user_edit_legalinfo_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 9
            goto L_0x003d
        L_0x0afc:
            java.lang.String r0 = "fbpay_delete_email_cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 10
            goto L_0x003d
        L_0x0b08:
            java.lang.String r0 = "fbpay_remove_paypal_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 11
            goto L_0x003d
        L_0x0b14:
            java.lang.String r0 = "fbpay_remove_paypal_save"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 12
            goto L_0x003d
        L_0x0b20:
            java.lang.String r0 = "fbpay_add_phone_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 13
            goto L_0x003d
        L_0x0b2c:
            java.lang.String r0 = "client_load_recurringpayments_init"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 14
            goto L_0x003d
        L_0x0b38:
            java.lang.String r0 = "fbpay_add_shipping_address_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 15
            goto L_0x003d
        L_0x0b44:
            java.lang.String r0 = "fbpay_edit_email_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 16
            goto L_0x003d
        L_0x0b50:
            java.lang.String r0 = "user_edit_currency_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 17
            goto L_0x003d
        L_0x0b5d:
            java.lang.String r0 = "user_click_credential_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 18
            goto L_0x003d
        L_0x0b6a:
            java.lang.String r0 = "client_edit_legalinfo_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 19
            goto L_0x003d
        L_0x0b76:
            java.lang.String r0 = "fbpay_remove_card_cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 20
            goto L_0x003d
        L_0x0b82:
            java.lang.String r0 = "client_load_fbpayhub_init"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 21
            goto L_0x003d
        L_0x0b8e:
            java.lang.String r0 = "fbpay_add_email_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 22
            goto L_0x003d
        L_0x0b9a:
            java.lang.String r0 = "fbpay_delete_shipping_address_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 23
            goto L_0x003d
        L_0x0ba6:
            java.lang.String r0 = "user_click_target_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 24
            goto L_0x003d
        L_0x0bb3:
            java.lang.String r0 = "set_p2p_default_method_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 25
            goto L_0x003d
        L_0x0bc0:
            java.lang.String r0 = "user_click_paymentactivity_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 26
            goto L_0x003d
        L_0x0bcd:
            java.lang.String r0 = "fbpay_add_card_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 27
            goto L_0x003d
        L_0x0bd9:
            java.lang.String r0 = "user_click_recurringpayments_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 28
            goto L_0x003d
        L_0x0be6:
            java.lang.String r0 = "currency_selector_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 29
            goto L_0x003d
        L_0x0bf2:
            java.lang.String r0 = "user_add_credential_exit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 30
            goto L_0x003d
        L_0x0bff:
            java.lang.String r0 = "client_load_paymentactivity_init"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 31
            goto L_0x003d
        L_0x0c0b:
            java.lang.String r0 = "fbpay_add_email_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 32
            goto L_0x003d
        L_0x0c17:
            java.lang.String r0 = "user_edit_credential_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 33
            goto L_0x003d
        L_0x0c24:
            java.lang.String r0 = "user_add_shippingaddress_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 34
            goto L_0x003d
        L_0x0c31:
            java.lang.String r0 = "user_edit_defaultcredential_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 35
            goto L_0x003d
        L_0x0c3e:
            java.lang.String r0 = "client_load_legalinfo_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 36
            goto L_0x003d
        L_0x0c4a:
            java.lang.String r0 = "set_b2c_default_method_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 37
            goto L_0x003d
        L_0x0c57:
            java.lang.String r0 = "client_remove_credential_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 38
            goto L_0x003d
        L_0x0c63:
            java.lang.String r0 = "fbpay_add_card_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 39
            goto L_0x003d
        L_0x0c6f:
            java.lang.String r0 = "user_add_contact_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 40
            goto L_0x003d
        L_0x0c7c:
            java.lang.String r0 = "fbpay_add_phone_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 41
            goto L_0x003d
        L_0x0c88:
            java.lang.String r0 = "fbpay_add_paypal_succeed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 42
            goto L_0x003d
        L_0x0c94:
            java.lang.String r0 = "client_load_paymentactivity_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 43
            goto L_0x003d
        L_0x0ca0:
            java.lang.String r0 = "user_edit_credential_submit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 44
            goto L_0x003d
        L_0x0cad:
            java.lang.String r0 = "client_load_paymentsettings_init"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 45
            goto L_0x003d
        L_0x0cb9:
            java.lang.String r0 = "client_load_fbpayhubhome_init"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 46
            goto L_0x003d
        L_0x0cc5:
            java.lang.String r0 = "client_load_credential_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 47
            goto L_0x003d
        L_0x0cd1:
            java.lang.String r0 = "fbpay_remove_card_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 48
            goto L_0x003d
        L_0x0cdd:
            java.lang.String r0 = "fbpay_remove_card_save"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 49
            goto L_0x003d
        L_0x0ce9:
            java.lang.String r0 = "user_click_auth_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 50
            goto L_0x003d
        L_0x0cf6:
            java.lang.String r0 = "fbpay_add_email_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 51
            goto L_0x003d
        L_0x0d02:
            java.lang.String r0 = "set_p2p_default_method_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 52
            goto L_0x003d
        L_0x0d0f:
            java.lang.String r0 = "client_edit_credential_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 53
            goto L_0x003d
        L_0x0d1b:
            java.lang.String r0 = "client_load_recurringpayments_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 54
            goto L_0x003d
        L_0x0d27:
            java.lang.String r0 = "fbpay_edit_phone_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 55
            goto L_0x003d
        L_0x0d33:
            java.lang.String r0 = "user_add_credential_submit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 56
            goto L_0x003d
        L_0x0d40:
            java.lang.String r0 = "currency_selector_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 57
            goto L_0x003d
        L_0x0d4c:
            java.lang.String r0 = "fbpay_remove_paypal_cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 58
            goto L_0x003d
        L_0x0d58:
            java.lang.String r0 = "fbpay_edit_email_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 59
            goto L_0x003d
        L_0x0d64:
            java.lang.String r0 = "fbpay_see_more_orders_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 60
            goto L_0x003d
        L_0x0d70:
            java.lang.String r0 = "fbpay_remove_card_succeed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 61
            goto L_0x003d
        L_0x0d7c:
            java.lang.String r0 = "fbpay_edit_phone_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 62
            goto L_0x003d
        L_0x0d88:
            java.lang.String r0 = "fbpay_add_shipping_address_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 63
            goto L_0x003d
        L_0x0d94:
            java.lang.String r0 = "set_b2c_default_method_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 64
            goto L_0x003d
        L_0x0da1:
            java.lang.String r0 = "fbpay_edit_card_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 65
            goto L_0x003d
        L_0x0dad:
            java.lang.String r0 = "fbpay_edit_card_save"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 66
            goto L_0x003d
        L_0x0db9:
            java.lang.String r0 = "fbpay_add_card_succeed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 67
            goto L_0x003d
        L_0x0dc5:
            java.lang.String r0 = "fbpay_remove_card_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 68
            goto L_0x003d
        L_0x0dd1:
            java.lang.String r0 = "fbpay_add_payment_method_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 69
            goto L_0x003d
        L_0x0ddd:
            java.lang.String r0 = "user_click_contact_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 70
            goto L_0x003d
        L_0x0dea:
            java.lang.String r0 = "fbpay_edit_paypal_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 71
            goto L_0x003d
        L_0x0df6:
            java.lang.String r0 = "user_click_receipt_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 72
            goto L_0x003d
        L_0x0e03:
            java.lang.String r0 = "user_edit_legalinfo_submit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 73
            goto L_0x003d
        L_0x0e10:
            java.lang.String r0 = "client_load_fbpaybranding_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 74
            goto L_0x003d
        L_0x0e1c:
            java.lang.String r0 = "user_edit_contact_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 75
            goto L_0x003d
        L_0x0e29:
            java.lang.String r0 = "client_load_fbpayhubhome_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 76
            goto L_0x003d
        L_0x0e35:
            java.lang.String r0 = "fbpay_add_phone_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 77
            goto L_0x003d
        L_0x0e41:
            java.lang.String r0 = "user_click_fbpaybranding_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 78
            goto L_0x003d
        L_0x0e4e:
            java.lang.String r0 = "user_edit_defaultcredential_submit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 79
            goto L_0x003d
        L_0x0e5b:
            java.lang.String r0 = "fbpay_edit_phone_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 80
            goto L_0x003d
        L_0x0e67:
            java.lang.String r0 = "currency_selector_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 81
            goto L_0x003d
        L_0x0e73:
            java.lang.String r0 = "user_click_fbpayhubhome_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 82
            goto L_0x003d
        L_0x0e80:
            java.lang.String r0 = "fbpay_edit_card_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 83
            goto L_0x003d
        L_0x0e8c:
            java.lang.String r0 = "fbpay_edit_shipping_address_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 84
            goto L_0x003d
        L_0x0e98:
            java.lang.String r0 = "fbpay_edit_email_failure"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 85
            goto L_0x003d
        L_0x0ea4:
            java.lang.String r0 = "fbpay_payment_history_see_all_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 86
            goto L_0x003d
        L_0x0eb0:
            java.lang.String r0 = "client_load_currency_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 87
            goto L_0x003d
        L_0x0ebc:
            java.lang.String r0 = "client_load_view_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 88
            goto L_0x003d
        L_0x0ec8:
            java.lang.String r0 = "client_add_credential_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 89
            goto L_0x003d
        L_0x0ed4:
            java.lang.String r0 = "user_edit_shippingaddress_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 90
            goto L_0x003d
        L_0x0ee1:
            java.lang.String r0 = "fbpay_delete_phone_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 91
            goto L_0x003d
        L_0x0eed:
            java.lang.String r0 = "fbpay_remove_paypal_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 92
            goto L_0x003d
        L_0x0ef9:
            java.lang.String r0 = "fbpay_edit_shipping_address_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 93
            goto L_0x003d
        L_0x0f05:
            java.lang.String r0 = "fbpay_delete_email_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 94
            goto L_0x003d
        L_0x0f11:
            java.lang.String r0 = "fbpay_add_paypal_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 95
            goto L_0x003d
        L_0x0f1d:
            java.lang.String r0 = "user_click_recurringreceipt_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 96
            goto L_0x003d
        L_0x0f2a:
            java.lang.String r0 = "fbpay_delete_email_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 97
            goto L_0x003d
        L_0x0f36:
            java.lang.String r0 = "fbpay_add_paypal_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 98
            goto L_0x003d
        L_0x0f42:
            java.lang.String r0 = "user_click_shippingaddress_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 99
            goto L_0x003d
        L_0x0f4f:
            java.lang.String r0 = "client_remove_credential_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 100
            goto L_0x003d
        L_0x0f5b:
            java.lang.String r0 = "client_load_receipt_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 101(0x65, float:1.42E-43)
            goto L_0x003d
        L_0x0f67:
            java.lang.String r0 = "fbpay_support_and_help_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 102(0x66, float:1.43E-43)
            goto L_0x003d
        L_0x0f73:
            java.lang.String r0 = "client_load_recurringreceipt_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 103(0x67, float:1.44E-43)
            goto L_0x003d
        L_0x0f7f:
            java.lang.String r0 = "client_load_paymentsettings_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 104(0x68, float:1.46E-43)
            goto L_0x003d
        L_0x0f8b:
            java.lang.String r0 = "fbpay_add_shipping_address_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 105(0x69, float:1.47E-43)
            goto L_0x003d
        L_0x0f97:
            java.lang.String r0 = "fbpay_transactions_details_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 106(0x6a, float:1.49E-43)
            goto L_0x003d
        L_0x0fa3:
            java.lang.String r0 = "fbpay_edit_card_succeed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 107(0x6b, float:1.5E-43)
            goto L_0x003d
        L_0x0faf:
            java.lang.String r0 = "fbpay_edit_shipping_address_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 108(0x6c, float:1.51E-43)
            goto L_0x003d
        L_0x0fbb:
            java.lang.String r0 = "fbpay_remove_paypal_succeed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 109(0x6d, float:1.53E-43)
            goto L_0x003d
        L_0x0fc7:
            java.lang.String r0 = "fbpay_add_card_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 110(0x6e, float:1.54E-43)
            goto L_0x003d
        L_0x0fd3:
            java.lang.String r0 = "fbpay_add_card_save"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 111(0x6f, float:1.56E-43)
            goto L_0x003d
        L_0x0fdf:
            java.lang.String r0 = "fbpay_delete_shipping_address_display"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 112(0x70, float:1.57E-43)
            goto L_0x003d
        L_0x0feb:
            java.lang.String r0 = "fbpay_delete_shipping_address_cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 113(0x71, float:1.58E-43)
            goto L_0x003d
        L_0x0ff7:
            java.lang.String r0 = "client_edit_legalinfo_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 114(0x72, float:1.6E-43)
            goto L_0x003d
        L_0x1003:
            java.lang.String r0 = "user_click_paymentsettings_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 115(0x73, float:1.61E-43)
            goto L_0x003d
        L_0x1010:
            java.lang.String r0 = "client_edit_credential_fail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 116(0x74, float:1.63E-43)
            goto L_0x003d
        L_0x101c:
            java.lang.String r0 = "fbpay_delete_phone_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 117(0x75, float:1.64E-43)
            goto L_0x003d
        L_0x1028:
            java.lang.String r0 = "client_add_credential_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 118(0x76, float:1.65E-43)
            goto L_0x003d
        L_0x1034:
            java.lang.String r0 = "user_click_defaultcredential_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 119(0x77, float:1.67E-43)
            goto L_0x003d
        L_0x1041:
            java.lang.String r0 = "user_remove_credential_submit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 120(0x78, float:1.68E-43)
            goto L_0x003d
        L_0x104e:
            java.lang.String r0 = "fbpay_security_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 121(0x79, float:1.7E-43)
            goto L_0x003d
        L_0x105a:
            java.lang.String r0 = "fbpay_contact_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 122(0x7a, float:1.71E-43)
            goto L_0x003d
        L_0x1066:
            java.lang.String r0 = "user_remove_credential_exit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 123(0x7b, float:1.72E-43)
            goto L_0x003d
        L_0x1073:
            java.lang.String r0 = "fbpay_delete_email_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 124(0x7c, float:1.74E-43)
            goto L_0x003d
        L_0x107f:
            java.lang.String r0 = "client_load_stars_success"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 125(0x7d, float:1.75E-43)
            goto L_0x003d
        L_0x108b:
            java.lang.String r0 = "user_click_accountlinking_atomic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 126(0x7e, float:1.77E-43)
            goto L_0x003d
        L_0x1098:
            java.lang.String r0 = "user_remove_credential_enter"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 127(0x7f, float:1.78E-43)
            goto L_0x003d
        L_0x10a5:
            java.lang.String r0 = "fbpay_delete_shipping_address_click"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r16 = 128(0x80, float:1.794E-43)
            goto L_0x003d
        L_0x10b1:
            X.QIp r3 = new X.QIp
            r3.<init>()
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_add_shippingaddress_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 27
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x10c6:
            X.QIp r3 = new X.QIp
            r3.<init>()
            r0 = r18
            X.0Ae r1 = A00(r3, r2, r7, r0)
            java.lang.String r0 = "user_add_shippingaddress_enter"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 387(0x183, float:5.42E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x10de:
            X.QIp r3 = new X.QIp
            r3.<init>()
            java.lang.String r0 = "add_shipping_address_save"
            X.0Ae r1 = A00(r3, r2, r7, r0)
            java.lang.String r0 = "user_add_shippingaddress_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 388(0x184, float:5.44E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x10f6:
            X.QIp r3 = new X.QIp
            r3.<init>()
            java.lang.String r0 = "shipping_address_settings"
            X.0Ae r1 = A00(r3, r2, r7, r0)
            java.lang.String r0 = "user_click_shippingaddress_atomic"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 404(0x194, float:5.66E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x110f:
            X.QIp r3 = new X.QIp
            r3.<init>()
            r0 = r18
            r3.A06(r6, r0)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_load_shippingaddress_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 96
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x1129:
            java.lang.Object r1 = X.Pxe.A0r(r13, r5)
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = r1.A07(r0)
            r0.getClass()
            java.lang.Long r1 = X.DbV.A0q(r0)
            X.QIp r3 = new X.QIp
            r3.<init>()
            java.lang.String r0 = "shipping_address_id"
            r3.A05(r0, r1)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_add_shippingaddress_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 28
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x1155:
            X.QIp r3 = A07(r5)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_shippingaddress_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 33
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x1169:
            X.QIp r3 = A07(r5)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_remove_shippingaddress_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 116(0x74, float:1.63E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x117d:
            X.QIp r3 = A07(r5)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_remove_shippingaddress_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 115(0x73, float:1.61E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x1191:
            java.lang.String r6 = X.Pxh.A0n(r7, r5)
            java.lang.String r0 = X.DbU.A0r(r14, r5)
            X.QIr r4 = new X.QIr
            r4.<init>()
            r4.A06(r7, r6)
            if (r0 == 0) goto L_0x11a6
            r4.A06(r14, r0)
        L_0x11a6:
            X.S40 r0 = r2.A00
            r0.A00(r1, r4, r3)
            return
        L_0x11ac:
            X.S40 r1 = r2.A00
            X.QI0 r2 = new X.QI0
            r2.<init>()
            X.XST r0 = X.XST.A02
            r2.A01(r0, r8)
            goto L_0x120a
        L_0x11b9:
            java.lang.Long r7 = X.Pxe.A0o(r0, r5)
            java.lang.String r4 = A09(r6, r5)
            java.lang.String r3 = A09(r8, r5)
            X.S40 r1 = r2.A00
            r0 = 0
            X.QI0 r2 = A04(r7, r3, r0, r4)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 47
            X.Pxk.A0W(r1, r2, r0)
            return
        L_0x11da:
            X.S40 r4 = r2.A00
            X.QIr r2 = new X.QIr
            r2.<init>()
            java.lang.String r0 = "orders_see_all"
            goto L_0x130b
        L_0x11e6:
            X.S40 r4 = r2.A00
            X.QIr r2 = new X.QIr
            r2.<init>()
            java.lang.String r0 = "add_payment_method"
            goto L_0x130b
        L_0x11f1:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = A02(r0)
            java.lang.String r15 = "edit_paypal"
            goto L_0x120a
        L_0x11fe:
            java.lang.Long r0 = A08(r0, r5)
            X.S40 r1 = r2.A00
            X.QI0 r2 = A03(r0)
            java.lang.String r15 = "edit_card"
        L_0x120a:
            r2.A06(r6, r15)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_credential_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 47
            X.Pxk.A0W(r1, r2, r0)
            return
        L_0x121b:
            java.lang.Long r1 = A08(r0, r5)
            X.QIp r3 = new X.QIp
            r3.<init>()
            r0 = r19
            r3.A06(r6, r0)
            java.lang.String r0 = "shipping_address_id"
            r3.A05(r0, r1)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_load_shippingaddress_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 96
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x123f:
            java.lang.String r5 = X.Pxh.A0n(r6, r5)
            X.S40 r4 = r2.A00
            X.QIt r2 = new X.QIt
            r2.<init>()
            java.lang.Class<X.RIz> r0 = X.C8960RIz.class
            java.lang.Enum r0 = X.RV4.A00(r0, r5)
            r0.getClass()
            X.RIz r0 = (X.C8960RIz) r0
            r2.A01(r0, r6)
            r4.A01(r1, r2, r3)
            return
        L_0x125c:
            java.lang.Long r1 = A08(r0, r5)
            X.QIp r3 = new X.QIp
            r3.<init>()
            r0 = r19
            r3.A06(r7, r0)
            java.lang.String r0 = "shipping_address_id"
            r3.A05(r0, r1)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_edit_shippingaddress_enter"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 407(0x197, float:5.7E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x1281:
            java.lang.Long r1 = A08(r0, r5)
            X.QIp r3 = new X.QIp
            r3.<init>()
            java.lang.String r0 = "edit_shipping_address_save"
            r3.A06(r7, r0)
            java.lang.String r0 = "shipping_address_id"
            r3.A05(r0, r1)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_edit_shippingaddress_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 408(0x198, float:5.72E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x12a6:
            java.lang.String r5 = A09(r14, r5)
            X.S40 r4 = r2.A00
            X.QIr r2 = new X.QIr
            r2.<init>()
            java.lang.String r0 = "support_and_help"
            r2.A06(r7, r0)
            r2.A06(r14, r5)
            r4.A00(r1, r2, r3)
            return
        L_0x12be:
            X.QIp r3 = A07(r5)
            X.S40 r0 = r2.A00
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_edit_shippingaddress_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 34
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x12d2:
            X.QIp r3 = A07(r5)
            java.lang.String r0 = "remove_shipping_address"
            X.0Ae r1 = A00(r3, r2, r7, r0)
            java.lang.String r0 = "user_remove_shippingaddress_enter"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 410(0x19a, float:5.75E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x12ea:
            X.QIp r3 = A07(r5)
            java.lang.String r0 = "remove_shipping_address_cancel"
            X.0Ae r1 = A00(r3, r2, r7, r0)
            java.lang.String r0 = "user_remove_shippingaddress_cancel"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 409(0x199, float:5.73E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        L_0x1302:
            X.S40 r4 = r2.A00
            X.QIr r2 = new X.QIr
            r2.<init>()
            java.lang.String r0 = "fbpay_security"
        L_0x130b:
            r2.A06(r7, r0)
            r4.A00(r1, r2, r3)
            return
        L_0x1312:
            X.S40 r4 = r2.A00
            X.QIt r2 = new X.QIt
            r2.<init>()
            X.RIz r0 = X.C8960RIz.A02
            r2.A01(r0, r6)
            r4.A01(r1, r2, r3)
            return
        L_0x1322:
            X.QIp r3 = A07(r5)
            java.lang.String r0 = "remove_shipping_address_save"
            X.0Ae r1 = A00(r3, r2, r7, r0)
            java.lang.String r0 = "user_remove_shippingaddress_submit"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 411(0x19b, float:5.76E-43)
            X.Pxk.A0W(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12410Stn.Cgl(java.lang.String, java.util.Map):void");
    }

    public C12410Stn(S40 s40) {
        this.A00 = s40;
    }

    public static C58840Ae A00(0bb r0, C12410Stn stn, String str, String str2) {
        r0.A06(str, str2);
        return stn.A00.A00;
    }

    public static Long A08(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return (Long) obj2;
    }

    public static String A09(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return (String) obj2;
    }

    public static String A0A(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2025722585:
                str2 = "edit_email";
                break;
            case 330394238:
                str2 = "add_email";
                break;
            default:
                return "phone";
        }
        if (str.equals(str2)) {
            return "email";
        }
        return "phone";
    }
}
