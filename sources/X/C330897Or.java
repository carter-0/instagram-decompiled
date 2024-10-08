package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Or  reason: invalid class name and case insensitive filesystem */
public abstract class C330897Or {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.model.direct.DirectShareTarget parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            com.instagram.model.direct.DirectShareTarget r3 = new com.instagram.model.direct.DirectShareTarget     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.<init>()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3 = 0
            return r3
        L_0x0016:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x0216
            java.lang.String r1 = r4.A0q()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r4.A1J()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            java.lang.String r0 = "pending_recipient"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r2 = 0
            if (r0 == 0) goto L_0x0050
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 != r0) goto L_0x004d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r2.<init>()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x003b:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x004d
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.C330927Ou.parseFromJson(r4)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x003b
            r2.add(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x003b
        L_0x004d:
            r3.A0Q = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x0050:
            r0 = 47
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x006e
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x0068
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x0068:
            r3.A0I = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x006a:
            r4.A0z()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x0016
        L_0x006e:
            java.lang.String r0 = "full_name"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x0085
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x0082
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x0082:
            r3.A0J = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x0085:
            java.lang.String r0 = "is_canonical"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x0094
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A0R = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x0094:
            java.lang.String r0 = "restriction_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x00a7
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A0D = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x00a7:
            java.lang.String r0 = "collection_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x00be
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x00bb
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x00bb:
            r3.A0G = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x00be:
            java.lang.String r0 = "collection_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x00cd
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A00 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x00cd:
            java.lang.String r0 = "logging_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x00dc
            com.instagram.model.direct.DirectShareTargetLoggingInfo r0 = X.AnonymousClass7P1.parseFromJson(r4)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A08 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x00dc:
            java.lang.String r0 = "is_cutover"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A0T = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x00eb:
            java.lang.String r0 = "thread_target"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x00fb
            X.3t2 r0 = X.AnonymousClass7P3.parseFromJson(r4)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A09 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x00fb:
            java.lang.String r0 = "context_line"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x0113
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x010f
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x010f:
            r3.A0H = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x0113:
            java.lang.String r0 = "secondary_context_line"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x012b
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x0127
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x0127:
            r3.A0N = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x012b:
            java.lang.String r0 = "has_current_user"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x013f
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A0A = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x013f:
            java.lang.String r0 = "creator_subscriber_thread_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x014f
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = X.C293615l4.parseFromJson(r4)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A05 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x014f:
            java.lang.String r0 = "creator_broadcast_thread_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x015f
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = X.C291115gY.parseFromJson(r4)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A04 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x015f:
            java.lang.String r0 = "discoverable_thread_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x016f
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = X.C293625l5.parseFromJson(r4)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A06 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x016f:
            java.lang.String r0 = "thread_subtype"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x017f
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A01 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x017f:
            java.lang.String r0 = "share_sheet_section"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x0193
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A0E = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x0193:
            java.lang.String r0 = "thread_picture_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x01a3
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r4)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A02 = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x01a3:
            java.lang.String r0 = "wa_group_thread_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x01bb
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x01b7
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x01b7:
            r3.A0O = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x01bb:
            java.lang.String r0 = "ibc_category_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r3.A0B = r0     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x01cf:
            java.lang.String r0 = "preset_member_ids"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x01fe
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 != r0) goto L_0x01fa
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            r2.<init>()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x01e4:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x01fa
            long r0 = r4.A0y()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x01e4
            r2.add(r0)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x01e4
        L_0x01fa:
            r3.A0P = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x01fe:
            java.lang.String r0 = "preset_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r0 == 0) goto L_0x006a
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            if (r1 == r0) goto L_0x0212
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
        L_0x0212:
            r3.A0L = r2     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            goto L_0x006a
        L_0x0216:
            r3.A0D()     // Catch:{ IOException -> 0x0221, Exception -> 0x021a }
            return r3
        L_0x021a:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0221:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330897Or.parseFromJson(X.16F):com.instagram.model.direct.DirectShareTarget");
    }

    public static void A00(17Z r10, DirectShareTarget directShareTarget) {
        String str;
        List list;
        Long l;
        Long l2;
        String str2;
        PIO pio;
        C254923tH C9i;
        MsysThreadId msysThreadId;
        MsysThreadId msysThreadId2;
        C291175gg r1;
        C254763t0 A00;
        r10.A0c();
        if (directShareTarget.A0Q != null) {
            16P.A03(r10, "pending_recipient");
            for (PendingRecipient pendingRecipient : directShareTarget.A0Q) {
                if (pendingRecipient != null) {
                    C330927Ou.A00(r10, pendingRecipient);
                }
            }
            r10.A0Y();
        }
        String str3 = directShareTarget.A0I;
        if (str3 != null) {
            r10.A0R(AnonymousClass000.A00(47), str3);
        }
        String str4 = directShareTarget.A0J;
        if (str4 != null) {
            r10.A0R("full_name", str4);
        }
        r10.A0S("is_canonical", directShareTarget.A0R);
        Integer num = directShareTarget.A0D;
        if (num != null) {
            r10.A0P("restriction_type", num.intValue());
        }
        String str5 = directShareTarget.A0G;
        if (str5 != null) {
            r10.A0R("collection_id", str5);
        }
        r10.A0P("collection_type", directShareTarget.A00);
        if (directShareTarget.A08 != null) {
            r10.A0q("logging_info");
            DirectShareTargetLoggingInfo directShareTargetLoggingInfo = directShareTarget.A08;
            r10.A0c();
            Double d = directShareTargetLoggingInfo.A01;
            if (d != null) {
                r10.A0N("final_score", d.doubleValue());
            }
            Boolean bool = directShareTargetLoggingInfo.A00;
            if (bool != null) {
                r10.A0S("is_from_server", bool.booleanValue());
            }
            r10.A0Z();
        }
        r10.A0S("is_cutover", directShareTarget.A0T);
        C254783t2 r2 = directShareTarget.A09;
        if (r2 != null) {
            r10.A0q("thread_target");
            ArrayList arrayList = null;
            C254773t1 A02 = AnonymousClass6W3.A02(r2);
            if (A02 == null || (A00 = AnonymousClass6W4.A00(A02)) == null) {
                str = null;
            } else {
                str = A00.A00;
            }
            C254773t1 A022 = AnonymousClass6W3.A02(r2);
            if (A022 == null || !(A022 instanceof C291175gg) || (r1 = (C291175gg) A022) == null) {
                list = null;
            } else {
                list = r1.A00;
            }
            AnonymousClass9HR A04 = AnonymousClass6W3.A04(r2);
            if (A04 == null || !(A04 instanceof MsysThreadId) || (msysThreadId2 = (MsysThreadId) A04) == null) {
                l = null;
            } else {
                l = Long.valueOf(msysThreadId2.A00);
            }
            AnonymousClass9HR A042 = AnonymousClass6W3.A04(r2);
            if (A042 == null || !(A042 instanceof MsysThreadId) || (msysThreadId = (MsysThreadId) A042) == null) {
                l2 = null;
            } else {
                l2 = msysThreadId.A02;
            }
            AnonymousClass9HR A043 = AnonymousClass6W3.A04(r2);
            if (A043 == null || (C9i = A043.C9i()) == null) {
                str2 = null;
            } else {
                str2 = C9i.A00;
            }
            AnonymousClass9HR A044 = AnonymousClass6W3.A04(r2);
            if (!(A044 == null || !(A044 instanceof PIO) || (pio = (PIO) A044) == null)) {
                List<MsysPendingRecipient> list2 = pio.A02;
                arrayList = new ArrayList(0Yv.A1E(list2, 10));
                for (MsysPendingRecipient fAh : list2) {
                    arrayList.add(new C49864FAh(fAh));
                }
            }
            AnonymousClass7P6 r3 = new AnonymousClass7P6(l, l2, str, str2, list, arrayList);
            if ((r2 instanceof C254763t0) || (r2 instanceof C291175gg) || (r2 instanceof MsysThreadId) || (r2 instanceof PIO)) {
                r10.A0c();
                String str6 = r3.A02;
                if (str6 != null) {
                    r10.A0R("direct_thread_id", str6);
                }
                List<PendingRecipient> list3 = r3.A04;
                if (list3 != null) {
                    16P.A03(r10, "direct_pending_recipients");
                    for (PendingRecipient pendingRecipient2 : list3) {
                        if (pendingRecipient2 != null) {
                            C330927Ou.A00(r10, pendingRecipient2);
                        }
                    }
                    r10.A0Y();
                }
                Long l3 = r3.A01;
                if (l3 != null) {
                    r10.A0Q("msys_thread_key", l3.longValue());
                }
                Long l4 = r3.A00;
                if (l4 != null) {
                    r10.A0Q("msys_thread_fbid", l4.longValue());
                }
                String str7 = r3.A03;
                if (str7 != null) {
                    r10.A0R("msys_transport_type", str7);
                }
                List<C49864FAh> list4 = r3.A05;
                if (list4 != null) {
                    16P.A03(r10, "msys_pending_recipients");
                    for (C49864FAh fAh2 : list4) {
                        if (fAh2 != null) {
                            r10.A0c();
                            String str8 = fAh2.A07;
                            if (str8 != null) {
                                r10.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
                            }
                            r10.A0Q("eimu", fAh2.A01);
                            r10.A0P("interop_user_type", fAh2.A00);
                            String str9 = fAh2.A09;
                            if (str9 != null) {
                                r10.A0R(Dbf.A01(), str9);
                            }
                            String str10 = fAh2.A05;
                            if (str10 != null) {
                                r10.A0R("full_name", str10);
                            }
                            String str11 = fAh2.A08;
                            if (str11 != null) {
                                r10.A0R(AnonymousClass000.A00(3986), str11);
                            }
                            String str12 = fAh2.A06;
                            if (str12 != null) {
                                r10.A0R("full_name_or_username", str12);
                            }
                            if (fAh2.A02 != null) {
                                r10.A0q("profile_pic_url");
                                16h.A01(r10, fAh2.A02);
                            }
                            r10.A0S("is_verified", fAh2.A0H);
                            r10.A0S("is_business", fAh2.A0B);
                            r10.A0S("is_unavailable", fAh2.A0G);
                            r10.A0S("is_blocking", fAh2.A0A);
                            r10.A0S("is_restricted", fAh2.A0F);
                            r10.A0S("is_connected", fAh2.A0C);
                            Integer num2 = fAh2.A04;
                            if (num2 != null) {
                                r10.A0P(AnonymousClass000.A00(185), num2.intValue());
                            }
                            r10.A0S("is_messaging_blocking", fAh2.A0D);
                            r10.A0S("is_messaging_psuedo_blocking", fAh2.A0E);
                            r10.A0Z();
                        }
                    }
                    r10.A0Y();
                }
                r10.A0Z();
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        String str13 = directShareTarget.A0H;
        if (str13 != null) {
            r10.A0R("context_line", str13);
        }
        String str14 = directShareTarget.A0N;
        if (str14 != null) {
            r10.A0R("secondary_context_line", str14);
        }
        Boolean bool2 = directShareTarget.A0A;
        if (bool2 != null) {
            r10.A0S("has_current_user", bool2.booleanValue());
        }
        if (directShareTarget.A05 != null) {
            r10.A0q("creator_subscriber_thread_info");
            C293615l4.A00(r10, directShareTarget.A05);
        }
        if (directShareTarget.A04 != null) {
            r10.A0q("creator_broadcast_thread_info");
            C291115gY.A00(r10, directShareTarget.A04);
        }
        if (directShareTarget.A06 != null) {
            r10.A0q("discoverable_thread_info");
            C293625l5.A00(r10, directShareTarget.A06);
        }
        r10.A0P("thread_subtype", directShareTarget.A01);
        Integer num3 = directShareTarget.A0E;
        if (num3 != null) {
            r10.A0P("share_sheet_section", num3.intValue());
        }
        if (directShareTarget.A02 != null) {
            r10.A0q("thread_picture_url");
            16h.A01(r10, directShareTarget.A02);
        }
        String str15 = directShareTarget.A0O;
        if (str15 != null) {
            r10.A0R("wa_group_thread_id", str15);
        }
        Boolean bool3 = directShareTarget.A0B;
        if (bool3 != null) {
            r10.A0S("ibc_category_type", bool3.booleanValue());
        }
        if (directShareTarget.A0P != null) {
            16P.A03(r10, "preset_member_ids");
            for (Number number : directShareTarget.A0P) {
                if (number != null) {
                    r10.A0h(number.longValue());
                }
            }
            r10.A0Y();
        }
        String str16 = directShareTarget.A0L;
        if (str16 != null) {
            r10.A0R("preset_type", str16);
        }
        r10.A0Z();
    }
}
