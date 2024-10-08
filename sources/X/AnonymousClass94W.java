package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.OdinContext;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.94W  reason: invalid class name */
public final class AnonymousClass94W {
    public final 1vo A00;

    public AnonymousClass94W(1vo r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.concurrent.Future, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final AnonymousClass3JD A00(Integer num, String str, String str2, String str3, String str4, List list) {
        String str5;
        ImmutableList immutableList;
        0qQ.A0B(str, 0);
        String str6 = str2;
        0qQ.A0B(str6, 1);
        String str7 = str3;
        0qQ.A0B(str7, 2);
        0qQ.A0B(num, 3);
        ? obj = new Object();
        try {
            C40134ASz aSz = (C40134ASz) AAF.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
            String str8 = "";
            if (str8.length() == 0) {
                str8 = "59705010009496";
            }
            2IS r3 = aSz.A00;
            r3.A04("test_id", str8);
            aSz.A04 = true;
            r3.A04("usecase", str);
            aSz.A05 = true;
            r3.A04("purpose", str7);
            aSz.A03 = true;
            r3.A04("version", str6);
            aSz.A06 = true;
            if (num.intValue() != 0) {
                str5 = "INFER";
            } else {
                str5 = "TRAIN";
            }
            r3.A04("client_msg_type", str5);
            aSz.A02 = true;
            r3.A04("client_msg", str4);
            if (list == null || list.isEmpty()) {
                immutableList = null;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    OdinContext odinContext = (OdinContext) it.next();
                    2IV r7 = new 2IV();
                    Map map = odinContext.A03;
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        2IV r10 = new 2IV();
                        r10.A07(Integer.valueOf(Integer.parseInt((String) entry.getKey())), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        r10.A07(Integer.valueOf((int) ((Number) entry.getValue()).longValue()), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        arrayList2.add(r10);
                    }
                    r7.A05("int_features", arrayList2);
                    Map map2 = odinContext.A02;
                    ArrayList arrayList3 = new ArrayList(map2.size());
                    for (Map.Entry entry2 : map2.entrySet()) {
                        2IV r102 = new 2IV();
                        r102.A07(Integer.valueOf(Integer.parseInt((String) entry2.getKey())), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        0Df.A00(r102.A02(), entry2.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        arrayList3.add(r102);
                    }
                    r7.A05("float_features", arrayList3);
                    Map map3 = odinContext.A04;
                    ArrayList arrayList4 = new ArrayList(map3.size());
                    for (Map.Entry entry3 : map3.entrySet()) {
                        2IV r2 = new 2IV();
                        r2.A07(Integer.valueOf(Integer.parseInt((String) entry3.getKey())), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        r2.A09((String) entry3.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        arrayList4.add(r2);
                    }
                    r7.A05("string_features", arrayList4);
                    arrayList.add(r7);
                }
                immutableList = ImmutableList.copyOf((Collection) arrayList);
            }
            r3.A05("contexts", immutableList);
            1Ef build = aSz.build();
            this.A00.ATL(new ASZ(obj), new C40125ASq(obj), build);
            return (AnonymousClass3JD) obj.get();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
