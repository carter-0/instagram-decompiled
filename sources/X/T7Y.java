package X;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;

public final class T7Y implements 1NU {
    public final /* synthetic */ 2IR A00;
    public final /* synthetic */ ResponseHandler A01;

    public T7Y(2IR r1, ResponseHandler responseHandler) {
        this.A01 = responseHandler;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        2ZL r6 = (2ZL) obj;
        0qQ.A0B(r6, 0);
        ProtocolVersion protocolVersion = HttpVersion.HTTP_1_1;
        int i = r6.A02;
        String str = r6.A03;
        if (str == null) {
            str = "";
        }
        HttpResponse basicHttpResponse = new BasicHttpResponse(protocolVersion, i, str);
        1Qb A002 = r6.A00();
        if (A002 != null) {
            basicHttpResponse.setEntity(new InputStreamEntity(A002.AjD(), A002.AJg()));
            this.A00.onSuccess(this.A01.handleResponse(basicHttpResponse));
            return new 1XQ();
        }
        throw AnonymousClass7TE.A0y();
    }
}
