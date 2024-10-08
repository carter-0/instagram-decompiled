package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TJr  reason: case insensitive filesystem */
public final /* synthetic */ class C13061TJr implements Runnable {
    public final /* synthetic */ C13453Tag A00;
    public final /* synthetic */ C9143RQu A01;
    public final /* synthetic */ C9144RQv A02;
    public final /* synthetic */ Sw8 A03;

    public /* synthetic */ C13061TJr(C13453Tag tag, C9143RQu rQu, C9144RQv rQv, Sw8 sw8) {
        this.A03 = sw8;
        this.A02 = rQv;
        this.A00 = tag;
        this.A01 = rQu;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        SQLiteDatabase A032;
        long j;
        long insert;
        byte[] bArr;
        Sw8 sw8 = this.A03;
        C9144RQv rQv = this.A02;
        C9143RQu rQu = this.A01;
        try {
            C13627Tdt tdt = sw8.A00;
            C8311Qnr qnr = (C8311Qnr) rQv;
            String str = qnr.A01;
            C13628Tdu AX5 = tdt.AX5(str);
            if (AX5 == null) {
                Sw8.A05.warning(String.format("Transport backend '%s' is not registered", new Object[]{str}));
                return;
            }
            C8310Qnq AOC = AX5.AOC(rQu);
            C12524SwA swA = (C12524SwA) sw8.A03;
            SQLiteDatabase A033 = swA.A03();
            C12524SwA.A02(A033, swA);
            try {
                C12524SwA swA2 = (C12524SwA) sw8.A02;
                RE0 re0 = qnr.A00;
                String str2 = AOC.A04;
                String.format("Storing event with priority=%s, name=%s for destination %s", new Object[]{re0, str2, str});
                A032 = swA2.A03();
                AnonymousClass0fa.A01(A032, -1684447961);
                long A0F = Pxh.A0F(swA2);
                C8315Qnv qnv = (C8315Qnv) swA2.A01;
                if (A0F >= qnv.A04) {
                    swA2.EAr(RJF.CACHE_FULL, str2, 1);
                    j = -1;
                } else {
                    Long A002 = C12524SwA.A00(A032, rQv);
                    if (A002 != null) {
                        insert = A002.longValue();
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("backend_name", str);
                        contentValues.put("priority", Integer.valueOf(C11149SCe.A00(re0)));
                        contentValues.put("next_request_ms", 0);
                        byte[] bArr2 = qnr.A02;
                        if (bArr2 != null) {
                            contentValues.put(Location.EXTRAS, Base64.encodeToString(bArr2, 0));
                        }
                        AnonymousClass0fa.A00(-45020059);
                        insert = A032.insert("transport_contexts", (String) null, contentValues);
                        AnonymousClass0fa.A00(-688351506);
                    }
                    int i = qnv.A02;
                    C11011S5i s5i = AOC.A02;
                    byte[] bArr3 = s5i.A01;
                    int length = bArr3.length;
                    boolean A1T = Pxg.A1T(length, i);
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("context_id", Long.valueOf(insert));
                    contentValues2.put("transport_name", str2);
                    contentValues2.put("timestamp_ms", Long.valueOf(AOC.A00));
                    contentValues2.put("uptime_ms", Long.valueOf(AOC.A01));
                    contentValues2.put("payload_encoding", s5i.A00.A00);
                    contentValues2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, AOC.A03);
                    contentValues2.put("num_attempts", 0);
                    contentValues2.put("inline", Boolean.valueOf(A1T));
                    if (A1T) {
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    contentValues2.put("payload", bArr);
                    AnonymousClass0fa.A00(-1135452151);
                    j = A032.insert("events", (String) null, contentValues2);
                    AnonymousClass0fa.A00(385815105);
                    if (!A1T) {
                        int ceil = (int) Math.ceil(((double) length) / ((double) i));
                        for (int i2 = 1; i2 <= ceil; i2++) {
                            byte[] copyOfRange = Arrays.copyOfRange(bArr3, (i2 - 1) * i, Math.min(i2 * i, length));
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("event_id", Long.valueOf(j));
                            contentValues3.put("sequence_num", Integer.valueOf(i2));
                            contentValues3.put("bytes", copyOfRange);
                            AnonymousClass0fa.A00(-2045053647);
                            A032.insert("event_payloads", (String) null, contentValues3);
                            AnonymousClass0fa.A00(-111369025);
                        }
                    }
                    Iterator A0u = AnonymousClass7TF.A0u(Collections.unmodifiableMap(AOC.A05));
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put("event_id", Long.valueOf(j));
                        contentValues4.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, DbT.A13(A1J));
                        contentValues4.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, DbS.A0s(A1J));
                        AnonymousClass0fa.A00(-17806623);
                        A032.insert("event_metadata", (String) null, contentValues4);
                        AnonymousClass0fa.A00(84745537);
                    }
                }
                Long valueOf = Long.valueOf(j);
                A032.setTransactionSuccessful();
                AnonymousClass0fa.A03(A032, 1571926387);
                long longValue = valueOf.longValue();
                if (longValue >= 1) {
                    new C8316Qnw(AOC, rQv, longValue);
                }
                ((Sw9) sw8.A01).EKM(rQv, 1, false);
                A033.setTransactionSuccessful();
                AnonymousClass0fa.A03(A033, 1896311136);
            } catch (Throwable th) {
                AnonymousClass0fa.A03(A033, -274389898);
                throw th;
            }
        } catch (Exception e) {
            Sw8.A05.warning(AnonymousClass7TF.A0m("Error scheduling event ", e));
        }
    }
}
