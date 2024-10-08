package X;

import android.util.Base64;
import android.util.JsonWriter;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;

/* renamed from: X.Pqr  reason: case insensitive filesystem */
public final class C74210Pqr extends 0Yg implements 0sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass65B A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74210Pqr(AnonymousClass65B r2, String str, String str2, String str3, String str4, 0sP r7, long j, boolean z) {
        super(4);
        this.A01 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A00 = j;
        this.A03 = str4;
        this.A07 = z;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        String str = (String) obj3;
        long A0R = AnonymousClass7TE.A0R(obj4);
        boolean A1U = AnonymousClass7TF.A1U(0, bArr, bArr2);
        0qQ.A0B(str, 2);
        AnonymousClass65B r9 = this.A01;
        String str2 = this.A05;
        String str3 = this.A04;
        String str4 = this.A02;
        long j = this.A00;
        String str5 = this.A03;
        boolean z = this.A07;
        AnonymousClass65C r0 = AnonymousClass65B.A03;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put("backup_id", str);
        A1H.put("attachment_index_key", AnonymousClass65B.A00(AnonymousClass65B.A01(C66581MXm.A11(str, str4)), "attachment_key_scope", bArr));
        A1H.put("backup_ent_fbid", -1);
        A1H.put("delivery_object_id", str4);
        A1H.put(C67009Mgh.A01(0, 9, 39), Long.valueOf(A0R));
        A1H.put("mailbox_partial_id", AnonymousClass65B.A00(str, "mailbox_id_scope", bArr));
        A1H.put("media_type", str5);
        A1H.put("product_type", "igd");
        A1H.put("salt_partial_id", AnonymousClass65B.A00(str3, "attachment_token_salt_scope", bArr));
        String str6 = "";
        A1H.put("sort_key", str6);
        A1H.put("salt_partial_access_token", AnonymousClass65B.A00(AnonymousClass65B.A01(C66581MXm.A11(str3, str4)), "attachment_token_salt_scope", bArr));
        A1H.put("salt_partial_attachment_index_key", AnonymousClass65B.A00(AnonymousClass65B.A01(C66581MXm.A11(str, str4)), "attachment_key_salt_scope", bArr));
        A1H.put("raw_identifiers", DbY.A0q("timestamp", Long.valueOf(j), AnonymousClass7TE.A1L("otid", str3), AnonymousClass7TE.A1L("server_thread_key", str2)));
        A1H.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A1H.put("message_partial_id", AnonymousClass65B.A00(str3, "message_id_scope", bArr));
        A1H.put("thread_partial_id", AnonymousClass65B.A00(str2, "thread_id_scope", bArr));
        A1H.put("raw_tokens", DbY.A0p("mailbox_root_key", Base64.encodeToString(bArr2, 2), AnonymousClass7TE.A1L("ocmf_client_state_blob", Base64.encodeToString(bArr, 2))));
        A1H.put("isOpenEB", Boolean.valueOf(z));
        try {
            StringWriter A0v = JTO.A0v();
            JsonWriter jsonWriter = new JsonWriter(A0v);
            jsonWriter.beginObject();
            AnonymousClass65B.A02(jsonWriter, r9, A1H);
            jsonWriter.endObject();
            jsonWriter.close();
            str6 = A0v.toString();
        } catch (IOException e) {
            0KC.A0F("IgMailboxEncryptedBackups", C273654mx.A00(1265), e);
        }
        1NY A0a = AnonymousClass7TG.A0a(r9.A02);
        A0a.A0A("direct_v2/restoration_cdn_url/");
        A0a.A9m("payload", str6);
        1OC A0S = DbU.A0S(A0a, NH5.class, OQ8.class);
        A0S.A00 = new NM8(str2, str3, str4, str5, this.A06, j, z);
        1ES.A05(A0S, 494878689, 3, A1U, A1U);
        return C60340gF.A00;
    }
}
