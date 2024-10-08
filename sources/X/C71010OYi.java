package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchFragmentImpl;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.OYi  reason: case insensitive filesystem */
public final class C71010OYi {
    public final UserSession A00;
    public final UIS A01;
    public final 1vn A02;
    public final ExecutorService A03;

    public static final void A00(AnonymousClass67Z r9, IGDReceiverFetchFragmentImpl iGDReceiverFetchFragmentImpl, OMq oMq, List list) {
        Integer num;
        if (iGDReceiverFetchFragmentImpl == null) {
            if (oMq != null) {
                oMq.A00("failed");
                oMq.A01("fetch failed", (Integer) null);
            }
            C72176Oxl.A02(r9, AnonymousClass7TE.A15("Receiver Fetch fields were not in the response"));
            return;
        }
        C254573sh r0 = C250663lr.Companion;
        ImmutableList A06 = iGDReceiverFetchFragmentImpl.A06(IGDReceiverFetchFragmentImpl.Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 1622975823);
        if (A06.size() != list.size()) {
            if (oMq != null) {
                oMq.A00("failed");
                oMq.A01("fetch failed", (Integer) null);
            }
            A06.size();
            C72176Oxl.A02(r9, AnonymousClass7TE.A15("Number of results returned did not match the number of results fetched for"));
            return;
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int size = A06.size();
        for (int i = 0; i < size; i++) {
            String A19 = AnonymousClass7TE.A19(list, i);
            String A07 = ((C250663lr) A06.get(i)).A07("preview_data");
            if (((TreeJNI) A06.get(i)).hasFieldValue(TraceFieldType.ErrorCode)) {
                num = C41846B3n.A0g((C250663lr) A06.get(i), TraceFieldType.ErrorCode, 1);
            } else {
                num = null;
            }
            builder.add(new OE4(A19, num, A07));
        }
        if (oMq != null) {
            oMq.A00("succeeded");
            oMq.A01.markerEnd(20132336, oMq.A00, 2);
        }
        C66990MgO.A00(r9, builder.build());
        r9.A00();
    }

    public static final void A01(AnonymousClass67Z r2, OMq oMq, Throwable th) {
        if (oMq != null) {
            oMq.A00("failed");
            oMq.A01("fetch failed", (Integer) null);
        }
        th.getMessage();
        C72176Oxl.A02(r2, AnonymousClass7TE.A15(th.getMessage()));
    }

    public C71010OYi(UserSession userSession, UIS uis, 1vn r3, ExecutorService executorService) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A03 = executorService;
        this.A01 = uis;
    }
}
