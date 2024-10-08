package X;

/* renamed from: X.Sdd  reason: case insensitive filesystem */
public final class C11635Sdd implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C11635Sdd(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0136, code lost:
        if (r8 != null) goto L_0x0034;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r33) {
        /*
            r32 = this;
            r2 = r32
            r1 = r33
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x02f7;
                case 1: goto L_0x0374;
                case 2: goto L_0x022e;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.S21 r1 = (X.S21) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r8 = r1.A01
            X.Tli r8 = (X.C13940Tli) r8
            r4 = 0
            if (r8 == 0) goto L_0x0135
            r7 = r8
            X.3lr r7 = (X.C250663lr) r7
            java.lang.Class<X.QXu> r6 = X.C7809QXu.class
            java.lang.String r5 = "add_multiple_credit_cards_proof_to_autofill(data:$input)"
            r3 = 944020111(0x38449a8f, float:4.6873985E-5)
            X.3lr r7 = r7.getOptionalTreeField(r0, r5, r6, r3)
            X.Tlh r7 = (X.C13939Tlh) r7
            if (r7 == 0) goto L_0x0135
            X.3lr r7 = (X.C250663lr) r7
            X.RGZ r6 = X.RGZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 2
            java.lang.String r3 = "status"
            java.lang.Enum r6 = r7.getOptionalEnumField(r5, r3, r6)
        L_0x0034:
            X.3lr r8 = (X.C250663lr) r8
            java.lang.Class<X.QXu> r7 = X.C7809QXu.class
            java.lang.String r5 = "add_multiple_credit_cards_proof_to_autofill(data:$input)"
            r3 = 944020111(0x38449a8f, float:4.6873985E-5)
            X.3lr r9 = r8.getOptionalTreeField(r0, r5, r7, r3)
            X.Tlh r9 = (X.C13939Tlh) r9
            if (r9 == 0) goto L_0x013a
            X.3lr r9 = (X.C250663lr) r9
            java.lang.Class<X.QXt> r8 = X.C7808QXt.class
            r5 = 1
            java.lang.String r7 = "credit_cards"
            r3 = 659994650(0x2756b81a, float:2.9798268E-15)
            com.google.common.collect.ImmutableList r3 = r9.getRequiredCompactedTreeListField(r5, r7, r8, r3)
            if (r3 == 0) goto L_0x013a
            r15 = 10
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r16 = r3.iterator()
        L_0x005f:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x013c
            java.lang.Object r9 = r16.next()
            X.Tlg r9 = (X.C13938Tlg) r9
            X.3lr r9 = (X.C250663lr) r9
            java.lang.Class<X.QSk> r8 = X.C7669QSk.class
            r3 = 1468537264(0x578819b0, float:2.99287817E14)
            X.3lr r3 = r9.reinterpretRequired(r0, r8, r3)
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.QSj> r13 = X.C7668QSj.class
            r12 = 14
            java.lang.String r11 = "billing_address"
            r10 = -753829666(0xffffffffd31178de, float:-6.2479807E11)
            X.3lr r14 = r3.getOptionalTreeField(r12, r11, r13, r10)
            r22 = 0
            if (r14 == 0) goto L_0x0131
            r9 = 7
            java.lang.String r8 = "country_code"
            java.lang.String r26 = r14.getOptionalStringField(r9, r8)
        L_0x0091:
            X.3lr r10 = r3.getOptionalTreeField(r12, r11, r13, r10)
            if (r10 == 0) goto L_0x012d
            r9 = 6
            java.lang.String r8 = "zip"
            java.lang.String r31 = r10.getOptionalStringField(r9, r8)
        L_0x009f:
            com.fbpay.w3c.Address r18 = new com.fbpay.w3c.Address
            r23 = r18
            r24 = r4
            r25 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r8 = "credential_id"
            java.lang.String r26 = r3.A0B(r8)
            java.lang.String r8 = "card_association_image_url"
            java.lang.String r24 = r3.getOptionalStringField(r5, r8)
            X.RFv r9 = X.C8927RFv.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r8 = "card_association"
            java.lang.String r23 = X.Pxi.A0g(r3, r9, r8, r0)
            r9 = 6
            java.lang.String r8 = "expiry_month"
            java.lang.String r8 = r3.getOptionalStringField(r9, r8)
            if (r8 == 0) goto L_0x012a
            java.lang.Integer r21 = X.Pxf.A0Z(r8)
        L_0x00d3:
            r9 = 7
            java.lang.String r8 = "expiry_year"
            java.lang.String r8 = r3.getOptionalStringField(r9, r8)
            if (r8 == 0) goto L_0x00e0
            java.lang.Integer r22 = X.Pxf.A0Z(r8)
        L_0x00e0:
            r9 = 12
            java.lang.String r8 = "last_four_digits"
            java.lang.String r28 = r3.getOptionalStringField(r9, r8)
            com.fbpay.w3c.CardDetails r17 = new com.fbpay.w3c.CardDetails
            r19 = r4
            r20 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 8
            java.lang.String r8 = "is_bound_to_device(device_key_pub_b64:$legacy_dev_pub_key)"
            boolean r23 = r3.getCoercedBooleanField(r9, r8)
            r9 = 9
            java.lang.String r8 = "latest_bound_device(device_keys_pub_b64:[$legacy_dev_pub_key,$shared_dev_pub_key])"
            java.lang.String r9 = r3.getOptionalStringField(r9, r8)
            if (r9 != 0) goto L_0x0105
            java.lang.String r9 = ""
        L_0x0105:
            java.lang.String r8 = "latestBoundDevice"
            X.C11367SPk.A03(r9, r8)
            X.XRg r11 = X.C21261XRg.A02
            java.lang.String r8 = "latest_bound_payment_type(device_keys_pub_b64:[$legacy_dev_pub_key])"
            java.lang.String r22 = X.Pxi.A0g(r3, r11, r8, r15)
            r10 = 11
            java.lang.String r8 = "latest_bound_original_payment_type(device_keys_pub_b64:[$shared_dev_pub_key])"
            java.lang.String r21 = X.Pxi.A0g(r3, r11, r8, r10)
            com.fbpay.w3c.W3CCardDetail r3 = new com.fbpay.w3c.W3CCardDetail
            r18 = r17
            r20 = r9
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r7.add(r3)
            goto L_0x005f
        L_0x012a:
            r21 = r4
            goto L_0x00d3
        L_0x012d:
            r31 = r4
            goto L_0x009f
        L_0x0131:
            r26 = r4
            goto L_0x0091
        L_0x0135:
            r6 = r4
            if (r8 == 0) goto L_0x013a
            goto L_0x0034
        L_0x013a:
            r9 = r4
            goto L_0x0140
        L_0x013c:
            java.util.List r9 = X.00k.A0a(r7)
        L_0x0140:
            java.lang.Throwable r5 = r1.A02
            boolean r1 = X.DbW.A1a(r5)
            java.lang.String r3 = "cardBindingUPLLogger"
            if (r1 == 0) goto L_0x029b
            X.RGZ r1 = X.RGZ.PARTIAL
            if (r6 == r1) goto L_0x0152
            X.RGZ r1 = X.RGZ.SUCCESS
            if (r6 != r1) goto L_0x029b
        L_0x0152:
            java.lang.Object r1 = r2.A02
            X.3F7 r1 = (X.AnonymousClass3F7) r1
            X.RsS r1 = r1.A00
            if (r1 == 0) goto L_0x031c
            java.lang.String r5 = r2.A03
            X.0qQ.A0B(r5, r0)
            java.lang.String r0 = r1.A01
            X.AnonymousClass2M6.A00 = r0
            X.2M7 r0 = X.2M7.A05
            X.AnonymousClass2MQ.A00(r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_add_autofilltemptorealproof_success"
            X.0Aj r4 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x01b1
            X.QHu r3 = new X.QHu
            r3.<init>()
            java.lang.String r0 = "dev_key_pub"
            r3.A06(r0, r5)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "is_legacy_key"
            r3.A03(r0, r1)
            X.Pxe.A1Q(r4, r3)
            java.lang.String r1 = X.AnonymousClass2M6.A00
            java.lang.String r0 = X.Dbj.A02()
            r4.AAJ(r0, r1)
            java.lang.String r1 = X.AnonymousClass2MT.A00
            java.lang.String r0 = "product_type"
            r4.AAJ(r0, r1)
            java.lang.String r1 = "android"
            java.lang.String r0 = "platform"
            r4.AAJ(r0, r1)
            java.lang.Long r1 = X.C51968G9o.A0u()
            java.lang.String r0 = "actual_event_time"
            r4.A9F(r0, r1)
            r4.Cgf()
        L_0x01b1:
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02f6
            java.util.Iterator r8 = r0.iterator()
        L_0x01bb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02f6
            java.lang.Object r1 = r8.next()
            X.QKv r1 = (X.C7580QKv) r1
            X.STY r0 = r1.A07
            if (r0 == 0) goto L_0x01bb
            X.7kb r0 = r1.A04
            if (r0 == 0) goto L_0x01bb
            X.QLA r0 = r0.C8U()
            if (r0 == 0) goto L_0x01bb
            X.STY r0 = r1.A07
            X.4gR r0 = r0.A0T
            X.RzL r0 = r0.A00
            X.JwI r7 = r0.A0D
            java.lang.Object r0 = r7.A00
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01bb
            java.lang.Object r0 = r7.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x01f9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x022b
            java.lang.Object r4 = r5.next()
            com.fbpay.w3c.W3CCardDetail r4 = (com.fbpay.w3c.W3CCardDetail) r4
            java.util.Iterator r3 = r9.iterator()
        L_0x0209:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0227
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r1 = r0.A08
            com.fbpay.w3c.CardDetails r0 = r4.A00
            java.lang.String r0 = r0.A08
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0209
            if (r2 == 0) goto L_0x0227
            r4 = r2
        L_0x0227:
            r6.add(r4)
            goto L_0x01f9
        L_0x022b:
            r7.A00 = r6
            goto L_0x01bb
        L_0x022e:
            java.lang.Object r6 = r2.A01
            X.SSY r6 = (X.SSY) r6
            java.lang.Object r3 = r2.A02
            X.RsH r3 = (X.C10440RsH) r3
            java.lang.String r5 = r2.A03
            X.SUj r1 = (X.SUj) r1
            boolean r0 = X.SUj.A0T(r1)
            if (r0 != 0) goto L_0x02f6
            java.lang.Throwable r4 = r1.A02
            boolean r0 = r4 instanceof X.C8284QnQ
            if (r0 != 0) goto L_0x02f6
            android.os.Bundle r0 = r3.A01
            java.util.HashMap r3 = X.S9s.A00(r0)
            java.util.List r0 = r6.A05
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r0 = "DYNAMIC_AUTH_AUTH_TYPES"
            r3.put(r0, r2)
            java.lang.String r0 = "DYNAMIC_AUTH_OPERATION_NAME"
            r3.put(r0, r5)
            boolean r0 = X.SUj.A0V(r1)
            if (r0 == 0) goto L_0x0272
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.2FO r2 = r0.A01
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r3)
            java.lang.String r0 = "client_load_dynamic_auth_success"
        L_0x026e:
            r2.Cgl(r0, r1)
            return
        L_0x0272:
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x02f6
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.2FO r2 = r0.A01
            java.lang.String r1 = X.C11302SKm.A01(r4)
            java.lang.String r0 = "DYNAMIC_AUTH_ERROR_MESSAGE"
            r3.put(r0, r1)
            int r0 = X.C11302SKm.A00(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "DYNAMIC_AUTH_ERROR_CODE"
            r3.put(r0, r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r3)
            java.lang.String r0 = "client_load_dynamic_auth_fail"
            goto L_0x026e
        L_0x029b:
            java.lang.Object r0 = r2.A02
            X.3F7 r0 = (X.AnonymousClass3F7) r0
            X.RsS r1 = r0.A00
            if (r1 == 0) goto L_0x031c
            if (r5 == 0) goto L_0x02a9
            java.lang.String r4 = r5.getMessage()
        L_0x02a9:
            java.lang.String r0 = r1.A01
            X.AnonymousClass2M6.A00 = r0
            X.2M7 r0 = X.2M7.A05
            X.AnonymousClass2MQ.A00(r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_add_autofilltemptorealproof_fail"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x02f6
            X.QHu r0 = new X.QHu
            r0.<init>()
            X.Pxe.A1Q(r2, r0)
            if (r4 != 0) goto L_0x02cc
            java.lang.String r4 = ""
        L_0x02cc:
            java.lang.String r0 = "error_message"
            r2.AAJ(r0, r4)
            java.lang.String r1 = X.AnonymousClass2M6.A00
            java.lang.String r0 = X.Dbj.A02()
            r2.AAJ(r0, r1)
            java.lang.String r1 = X.AnonymousClass2MT.A00
            java.lang.String r0 = "product_type"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "android"
            java.lang.String r0 = "platform"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = X.C51968G9o.A0u()
            java.lang.String r0 = "actual_event_time"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x02f6:
            return
        L_0x02f7:
            X.SUj r1 = (X.SUj) r1
            boolean r0 = X.SUj.A0V(r1)
            if (r0 == 0) goto L_0x02f6
            java.lang.Object r10 = r1.A01
            if (r10 == 0) goto L_0x02f6
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.0eK r0 = r0.A0I
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            java.lang.String r3 = "https://www.instagram.com/payments/paypal_close/"
            java.lang.Object r0 = r2.A02
            X.QDT r0 = (X.QDT) r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r9 = r0.A02
            if (r9 != 0) goto L_0x0324
            java.lang.String r3 = "ecpPaymentRequest"
        L_0x031c:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0324:
            com.facebookpay.logging.LoggingContext r1 = r0.A03
            if (r1 != 0) goto L_0x032b
            java.lang.String r3 = "loggingContext"
            goto L_0x031c
        L_0x032b:
            java.lang.String r10 = (java.lang.String) r10
            r5 = 1
            r4 = 0
            java.lang.String[] r8 = new java.lang.String[]{r3}
            java.lang.String r7 = r2.A03
            X.RFs r6 = X.C8924RFs.A0c
            X.DbY.A1S(r9, r10)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            r3.putParcelable(r0, r9)
            java.lang.String r0 = "logging_context"
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "ECP_PAYPAL_BA_LOADING_URL"
            r3.putString(r0, r10)
            java.lang.String r1 = "ECP_CONTAINER_FRAGMENT_TYPE"
            java.lang.String r0 = "web_view_fragment"
            r3.putString(r1, r0)
            java.lang.String r1 = "ECP_CONTAINER_FRAGMENT_TITLE"
            r0 = 0
            r3.putString(r1, r0)
            java.lang.String r0 = "ECP_CONTENT_FRAGMENT_REQUEST_KEY"
            r3.putString(r0, r7)
            java.lang.String r0 = "ECP_PAYPAL_BA_ALLOWED_INTERCEPT_URL"
            r3.putStringArray(r0, r8)
            java.lang.String r0 = "ECP_CONTAINER_FRAGMENT_NAV_BAR_STYLE"
            r3.putSerializable(r0, r6)
            java.lang.Object r1 = r2.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "ecp_container_fragment"
            X.C11336SNr.A00(r3, r1, r0, r5, r4)
            return
        L_0x0374:
            X.SUj r1 = (X.SUj) r1
            boolean r0 = X.SUj.A0V(r1)
            java.lang.Object r4 = r2.A01
            X.QDE r4 = (X.QDE) r4
            if (r0 == 0) goto L_0x0422
            java.lang.String r10 = "VERIFY_BIO_TO_DISABLE_BIO_HUB"
            java.lang.String r3 = r2.A03
            java.lang.Object r5 = r1.A01
            r5.getClass()
            X.SNj r5 = (X.C11330SNj) r5
            java.lang.Object r2 = r2.A02
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r9 = "logger_data"
            com.facebookpay.logging.FBPayLoggerData r7 = X.Pxi.A0J(r2)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "AUTH_METHOD_TYPE"
            java.lang.String r0 = "BIO"
            r6.putString(r1, r0)
            java.lang.String r0 = "PAYMENT_TYPE"
            r6.putString(r0, r3)
            r6.putParcelable(r9, r7)
            X.RsH r11 = new X.RsH
            r11.<init>(r6)
            android.os.Bundle r8 = r11.A01
            X.SQ8.A02(r10, r8)
            if (r2 == 0) goto L_0x03bb
            android.os.Parcelable r0 = r2.getParcelable(r9)
            r8.putParcelable(r9, r0)
        L_0x03bb:
            java.lang.String r7 = r5.A06
            com.fbpay.auth.models.PttPayload r12 = com.fbpay.auth.models.PttPayload.deleteBio(r7)
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.2FO r6 = r0.A01
            java.util.Map r1 = X.S9s.A01(r8)
            java.lang.String r0 = "fbpay_remove_biometric"
            r6.Cgl(r0, r1)
            X.SIS r6 = r4.A07
            r1 = 1
            r0 = 0
            java.util.HashSet r9 = X.Pxj.A0v(r5)
            X.SvT r10 = new X.SvT
            r10.<init>(r0, r4, r11)
            java.lang.String r0 = "PAYMENT_ACCOUNT_ID"
            java.lang.String r14 = r8.getString(r0)
            java.util.Map r8 = X.S9s.A01(r8)
            java.lang.String r13 = "REVOKE_AUTH_TICKET"
            r0 = 5
            X.0qQ.A0B(r8, r0)
            X.SvQ r11 = X.C11095S9w.A00(r10, r9)
            r15 = 0
            X.0qQ.A0B(r12, r1)
            X.SFo r10 = new X.SFo
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r8
            r20 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.5A3 r0 = r6.A01
            X.DEc r8 = new X.DEc
            r11 = r3
            r12 = r7
            r13 = r1
            r9 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            X.QCn r1 = X.SQA.A00(r8, r6, r0, r10)
            X.2gB r0 = r4.A03
            X.Sdh r6 = new X.Sdh
            r8 = r1
            r9 = r4
            r10 = r5
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A0E(r1, r6)
            return
        L_0x0422:
            X.2gB r2 = r4.A03
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.SUj r0 = X.SUj.A06(r1, r0)
            r2.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11635Sdd.onChanged(java.lang.Object):void");
    }
}
