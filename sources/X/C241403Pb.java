package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.3Pb  reason: invalid class name and case insensitive filesystem */
public final class C241403Pb extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C241393Pa A01;
    public final /* synthetic */ Set A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C241403Pb(UserSession userSession, C241393Pa r5, Set set) {
        super(331, 3, false, false);
        this.A00 = userSession;
        this.A02 = set;
        this.A01 = r5;
    }

    public final void run() {
        0sm hashMap;
        1WY A002;
        Cursor query;
        AnonymousClass3PY r0 = AnonymousClass3PX.A02;
        AnonymousClass3PX A003 = AnonymousClass3PY.A00(this.A00);
        Set<String> set = this.A02;
        set.size();
        C252103oZ r9 = A003.A00;
        HashSet hashSet = new HashSet(set);
        Map map = r9.A07;
        hashSet.retainAll(map.keySet());
        if (hashSet.isEmpty()) {
            hashMap = 0Yt.A0E();
        } else {
            hashMap = new HashMap();
            try {
                C252143od r11 = r9.A05;
                long max = Math.max(r9.A03, System.currentTimeMillis() - r9.A02);
                StringBuilder sb = new StringBuilder();
                sb.append("\n");
                sb.append("    SELECT *");
                sb.append("\n");
                sb.append("    FROM user_reel_medias");
                sb.append("\n");
                sb.append("    WHERE id in (");
                int size = set.size();
                1wO.A00(sb, size);
                sb.append(")");
                sb.append("\n");
                sb.append("      AND stored_time > ");
                sb.append("?");
                String obj = sb.toString();
                int i = size + 1;
                TreeMap treeMap = 1WY.A08;
                A002 = 1Wa.A00(obj, i);
                int i2 = 1;
                for (String ADh : set) {
                    A002.ADh(i2, ADh);
                    i2++;
                }
                A002.ADa(i, max);
                C251983oI r1 = r11.A01;
                r1.assertNotSuspendingTransaction();
                query = r1.query((AnonymousClass1WA) A002, (CancellationSignal) null);
                int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int A013 = 1Wd.A01(query, "media_ids");
                int A014 = 1Wd.A01(query, "data");
                int A015 = 1Wd.A01(query, "stored_time");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    arrayList.add(new AnonymousClass46V(query.getString(A012), query.getString(A013), query.getBlob(A014), query.getLong(A015)));
                }
                query.close();
                A002.A00();
                arrayList.size();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass46V r02 = (AnonymousClass46V) it.next();
                    String str = r02.A01;
                    byte[] bArr = r02.A03;
                    C252113oa r03 = r9.A04;
                    0qQ.A0B(bArr, 0);
                    List list = AnonymousClass46W.parseFromJson(0c9.A04.A02(r03.A00, bArr)).A00;
                    list.size();
                    hashMap.put(str, list);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!hashMap.containsKey(next)) {
                        map.remove(next);
                    }
                }
            } catch (Exception e) {
                0KC.A0F("UserReelMediasRoom", "Failed to load user reel blob", e);
                0wb.A03("UserReelMediasRoom", 002.A0R("Failed to load user reel blob: ", e.getMessage()));
            } catch (Throwable th) {
                query.close();
                A002.A00();
                throw th;
            }
        }
        C241393Pa r12 = this.A01;
        AnonymousClass3PT r3 = r12.A01;
        ((Handler) r3.A05.getValue()).post(new AnonymousClass4W6(r12.A00, r3, hashMap));
    }
}
