package X;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mqe  reason: case insensitive filesystem */
public final class C67606Mqe extends 0Yg implements 0sP {
    public static final C67606Mqe A00 = new C67606Mqe();

    public C67606Mqe() {
        super(1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.1K2] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        List list = (List) obj;
        if (list != null) {
            try {
                byte[] bArr = new byte[0];
                HashMap A1E = AnonymousClass7TE.A1E();
                Iterator it = list.iterator();
                C61080JwI jwI = null;
                String str = null;
                List list2 = null;
                while (true) {
                    if (it.hasNext()) {
                        C67605Mqd mqd = (C67605Mqd) it.next();
                        byte[] bArr2 = mqd.A04;
                        if (bArr2.length != 0) {
                            if (bArr.length != 0) {
                                exc = new Exception("There are more than one document in the list");
                                break;
                            }
                            bArr = bArr2;
                        }
                        for (Map.Entry entry : mqd.A03.entrySet()) {
                            A1E.put(entry.getKey(), entry.getValue());
                        }
                        str = mqd.A01;
                        list2 = mqd.A02;
                        jwI = mqd.A00;
                    } else if (bArr.length == 0 || str == null || list2 == null || jwI == null) {
                        exc = new Exception("Invalid data when combining decoded document and images");
                    } else {
                        ImmutableMap copyOf = ImmutableMap.copyOf(A1E);
                        0qQ.A07(copyOf);
                        return new 1Ks(new C67605Mqd(jwI, str, list2, copyOf, bArr));
                    }
                }
            } catch (C69526Nn8 e) {
                ? obj2 = new Object();
                obj2.setException(e);
                return obj2;
            }
        } else {
            exc = new Exception("Model list is null");
        }
        throw exc;
    }
}
