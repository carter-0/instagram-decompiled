package X;

import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.NSd  reason: case insensitive filesystem */
public final class C68671NSd extends 0ng {
    public final /* synthetic */ C370758x1 A00;
    public final /* synthetic */ AnonymousClass43O A01;
    public final /* synthetic */ C370538wd A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68671NSd(C370758x1 r4, AnonymousClass43O r5, C370538wd r6, String str, String str2, String str3, String str4, List list) {
        super(704638247, 3, false, false);
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A07 = list;
        this.A00 = r4;
        this.A06 = str4;
    }

    public static String A00(0f9 r4, C254703su r5, C300585xS r6) {
        r4.ABQ("threadId", String.valueOf(r6.A00().longValue()));
        r4.ABQ("messageId", r5.A0f());
        return r5.A0k();
    }

    public final void run() {
        Boolean bool;
        Integer num;
        List list;
        String str;
        String str2;
        N4L n4l;
        AnonymousClass43O r0 = this.A01;
        AnonymousClass43O r37 = r0;
        AnonymousClass43S r5 = r0.A08;
        UserSession userSession = r0.A04;
        C370538wd r4 = this.A02;
        String str3 = r4.A1D;
        0qQ.A07(str3);
        String A0x = C66581MXm.A0x(r4.A00());
        boolean CKJ = r4.CKJ();
        String str4 = this.A04;
        boolean A002 = r37.A05.A00();
        boolean A022 = 2Aj.A02(userSession);
        String str5 = this.A03;
        Integer num2 = null;
        0qQ.A0B(str5, 8);
        AnonymousClass7BV A012 = r5.A01(userSession, (Boolean) null, (Boolean) null, (Long) null, 20133400, A002, A022, true);
        02m r36 = r5.A00;
        int i = A012.A01;
        int i2 = A012.A00;
        int i3 = i2;
        MarkerEditor withMarker = r36.withMarker(i, i2);
        withMarker.annotate(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        withMarker.annotate("server_has_older", CKJ);
        withMarker.annotate("fetch_reason", str4);
        withMarker.annotate("server_cursor_id", (String) null);
        withMarker.annotate("thread_jid", A0x);
        withMarker.annotate("inbox_fetch_uuid", str5);
        withMarker.markerEditingCompleted();
        String str6 = this.A05;
        if (str6 != null) {
            r5.A09(A012, "original_fetch_reason", str6);
        }
        String str7 = r4.A1D;
        0qQ.A07(str7);
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            C254703su A0a = C66580MXl.A0a(it);
            0f9 AEf = 0wj.A01.AEf(002.A0R("going to trigger makeup call for missing message, makeup call reason is ", str4), 20123732);
            AEf.ABQ("error", A00(AEf, A0a, r4));
            AEf.report();
        }
        C370758x1 r10 = this.A00;
        String str8 = this.A06;
        r10.A03(userSession, A012, r4, str8, str4, DirectThreadApi.A00(userSession, "snapshot"));
        ArrayList A013 = r10.A01(r4);
        if (DbT.A1b(A013)) {
            r5.A09(A012, "size_of_error_message_post_makeup_call", String.valueOf(A013.size()));
            r5.A09(A012, "error_message_post_makeup_call", String.valueOf(00k.A0P(", ", "", "", A013, C74095Poy.A00)));
            C242373Tu r02 = r4.A0Z;
            if (r02 == null || !r02.A03(userSession)) {
                str = "is not triggered";
            } else {
                str = "is triggered";
            }
            Iterator it2 = A013.iterator();
            while (it2.hasNext()) {
                C254703su A0a2 = C66580MXl.A0a(it2);
                0f9 AEf2 = 0wj.A01.AEf(002.A0g("makeupCall failed to intercept message, server response parsing ", str, " later to fix this"), 20123732);
                AEf2.ABQ("error", A00(AEf2, A0a2, r4));
                AEf2.report();
            }
            C242373Tu r03 = r4.A0Z;
            if (r03 == null || !r03.A03(userSession)) {
                ArrayList A0r = AnonymousClass7TG.A0r(A013);
                Iterator it3 = A013.iterator();
                while (it3.hasNext()) {
                    A0r.add(C66580MXl.A0a(it3).A1j);
                }
                r5.A09(A012, "failed_to_decrypt_msg_otids", 00k.A0P(", ", "", "", A0r, (0sP) null));
                r5.A0A(A012, "parse_server_response", "reverb_failed_to_intercept_encrypted_messages");
            } else {
                C370748x0.A00();
                C66840MdY A014 = C66843Mdb.A01(userSession);
                AnonymousClass43S r6 = A014.A06;
                r6.A07(A012, "parse_server_response_start");
                ArrayList A1C = AnonymousClass7TE.A1C();
                StringBuilder A1A = AnonymousClass7TE.A1A();
                Iterator it4 = r4.A07.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    C254703su r102 = (C254703su) AnonymousClass7TF.A0a(it4);
                    if (r102.A10 == 2FW.A0n) {
                        String A032 = C2611348j.A03(r102.A0g());
                        String str9 = r102.A1Y;
                        if (A032 == null || str9 == null) {
                            i4++;
                            r102.A1F(002.A0g(r102.A0k(), " server response server fail for ", "otid or encryptedPayload is null."));
                            A1C.add(r102);
                            0f9 AEf3 = 0wj.A01.AEf("parseServerResponse failed to parse message", 20123732);
                            AEf3.ABQ("error", A00(AEf3, r102, r4));
                            AEf3.report();
                        } else {
                            JSONObject A17 = C66580MXl.A17(str9);
                            if (A17.getBoolean("is_open_eb")) {
                                long longValue = r4.A00().longValue();
                                DirectThreadKey directThreadKey = new DirectThreadKey(r4.A1D, (List) null);
                                List A1J = C51966G9m.A1J(r4.A1c);
                                0qQ.A0K(r4.A0y, 1);
                                C254703su r2 = (C254703su) C66840MdY.A03(A014, new P0W(A17), new C331237Qc(directThreadKey, A1J), longValue, true).A00;
                                if (r2 != null) {
                                    N4L n4l2 = r102.A0D;
                                    if (n4l2 != null) {
                                        n4l = new N4L((Boolean) n4l2.A03, 1, false, n4l2.A06, n4l2.A04);
                                    } else {
                                        n4l = null;
                                    }
                                    r2.A0w(n4l);
                                    A1C.add(r2);
                                    C66580MXl.A1V(A032, ", ", A1A);
                                } else {
                                    str2 = "failed to build message from raw data. ";
                                }
                            } else {
                                str2 = "non ttlc message. ";
                            }
                            i4++;
                            r102.A1F(002.A0g(r102.A0k(), " server response parse failed for ", str2));
                        }
                    }
                    A1C.add(r102);
                }
                if (A1C.size() != r4.A07.size()) {
                    0KC.A0E("ArmadilloExpressEncryptedBackupReverbImpl", "Parsed message size doesn't match with the serverThreadResult");
                }
                r4.A07 = A1C;
                r6.A07(A012, "parse_server_response_end");
                r6.A09(A012, "otids_created_directly_from_eb_response", DbT.A10(A1A));
                if (i4 > 0) {
                    r6.A09(A012, "size_of_error_message_for_parsing_server_response", String.valueOf(i4));
                    StringBuilder A1A2 = AnonymousClass7TE.A1A();
                    Iterator it5 = r4.A07.iterator();
                    while (it5.hasNext()) {
                        C254703su r13 = (C254703su) AnonymousClass7TF.A0a(it5);
                        if (r13.A10 == 2FW.A0n) {
                            0f9 AEf4 = 0wj.A01.AEf("parseServerResponse failed to parse message", 20123732);
                            AEf4.ABQ("error", A00(AEf4, r13, r4));
                            AEf4.report();
                            A1A2.append(002.A11("directMessage_id: ", r13.A0g(), ", error: ", r13.A0k(), ", "));
                        }
                    }
                    C370778x3 r103 = A014.A01;
                    String A10 = DbT.A10(A1A);
                    String A102 = DbT.A10(A1A2);
                    String str10 = r4.A1D;
                    0qQ.A0B(str10, 2);
                    StringBuilder A1A3 = AnonymousClass7TE.A1A();
                    long currentTimeMillis = System.currentTimeMillis();
                    String[] strArr = {002.A0e("server_response_parse_", " : [", currentTimeMillis), 002.A0g("timestamp : ", r103.A02.format(new Date(currentTimeMillis)), ", "), 002.A0g("thread_id : ", str10, ", "), 002.A0g("built_from_eb_message_otids : ", A10, ", "), 002.A0g("error : ", A102, ", ")};
                    int i5 = 0;
                    do {
                        A1A3.append(strArr[i5]);
                        i5++;
                    } while (i5 < 5);
                    A1A3.append("]");
                    r103.A00.add(A1A3.toString());
                    r6.A09(A012, "error_message_for_parsing_server_response", DbT.A10(A1A2));
                    r6.A0A(A012, "parse_server_response", DbT.A10(A1A2));
                }
            }
        }
        r37.A09.A9r(r4, new DirectThreadKey(str7, (List) null), str8);
        C370878xD r22 = r4.A01;
        if (r22 != null) {
            bool = Boolean.valueOf(r22.A03);
            num = C51968G9o.A0t(r22.A01);
        } else {
            bool = null;
            num = null;
        }
        C370878xD r04 = r4.A01;
        if (!(r04 == null || (list = r04.A02) == null)) {
            num2 = C51968G9o.A0t(list);
        }
        r5.A0F(A012, bool, num, num2);
        r36.markerEnd(i, i3, 2);
    }
}
