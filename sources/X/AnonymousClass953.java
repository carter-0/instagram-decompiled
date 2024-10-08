package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.953  reason: invalid class name */
public final class AnonymousClass953 {
    public final 1vo A00;

    public AnonymousClass953(1vo r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A00(Integer num, String str, String str2, List list, C62320sa r20, 0sP r21, long j) {
        String str3;
        String str4 = str;
        0qQ.A0B(str4, 0);
        String str5 = str2;
        0qQ.A0B(str5, 1);
        ? obj = new Object();
        int i = (int) (j / 1000);
        try {
            AnonymousClass955 r6 = (AnonymousClass955) AnonymousClass954.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
            2IS r4 = r6.A00;
            r4.A04("use_case", str4);
            r6.A03 = true;
            r4.A04("use_case_version", str5);
            r6.A04 = true;
            int intValue = num.intValue();
            if (intValue == 1) {
                str3 = "TRAIN";
            } else if (intValue == 3) {
                str3 = "PREDICT";
            } else {
                String A0g = 002.A0g("task type ", C393049vo.A00(num), " not allowed");
                0qQ.A0B(A0g, 1);
                throw new Exception(A0g);
            }
            r4.A04("flow", str3);
            r6.A02 = true;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Example example = (Example) it.next();
                2IV r2 = new 2IV();
                r2.A09(example.A00.A01, "context");
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : example.A02.entrySet()) {
                    2IV r10 = new 2IV();
                    r10.A09((String) entry.getKey(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    r10.A09(((FeatureData) entry.getValue()).A00(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    arrayList2.add(r10);
                }
                ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList2);
                0qQ.A07(copyOf);
                r2.A05("features", copyOf);
                r2.A09(example.A01, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                r2.A07(Integer.valueOf(i), "timestamp");
                arrayList.add(r2);
            }
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) arrayList);
            0qQ.A07(copyOf2);
            r4.A05("examples", copyOf2);
            r6.A01 = true;
            PandoGraphQLRequest A002 = r6.build();
            AnonymousClass957 r3 = new AnonymousClass957(obj, r20, r21);
            this.A00.ATL(new AnonymousClass959(r3), new AnonymousClass958(r3), A002);
            return obj;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
