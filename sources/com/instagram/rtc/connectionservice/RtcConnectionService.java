package com.instagram.rtc.connectionservice;

import X.09i;
import X.0qQ;
import X.1XD;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass38W;
import X.AnonymousClass7TE;
import X.AnonymousClass9IV;
import X.C67665Mrv;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentMap;

public final class RtcConnectionService extends ConnectionService {
    public final Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Bundle bundle;
        String string;
        String string2;
        0qQ.A0B(connectionRequest, 1);
        UserSession A08 = 09i.A0A.A08(this);
        1XD r7 = (1XD) AnonymousClass38W.A00().A07.getValue();
        Bundle extras = connectionRequest.getExtras();
        if (extras == null || (bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS")) == null || (string = bundle.getString("com.instagram.rtc.connection.connection_id")) == null || (string2 = bundle.getString("com.instagram.rtc.connection.display_name")) == null) {
            Connection createFailedConnection = Connection.createFailedConnection(new DisconnectCause(1));
            0qQ.A07(createFailedConnection);
            return createFailedConnection;
        }
        Uri address = connectionRequest.getAddress();
        0qQ.A07(address);
        int videoState = connectionRequest.getVideoState();
        C67665Mrv mrv = new C67665Mrv(A08, r7, string);
        mrv.setConnectionProperties(128);
        mrv.setAddress(address, 1);
        mrv.setCallerDisplayName(string2, 1);
        mrv.setVideoState(videoState);
        mrv.setRinging();
        mrv.setExtras(extras);
        return mrv;
    }

    public final void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        0qQ.A0B(connectionRequest, 1);
        super.onCreateIncomingConnectionFailed(phoneAccountHandle, connectionRequest);
    }

    public final Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        0qQ.A0B(connectionRequest, 1);
        UserSession A08 = 09i.A0A.A08(this);
        1XD r7 = (1XD) AnonymousClass38W.A00().A07.getValue();
        Bundle extras = connectionRequest.getExtras();
        String string = extras.getString("com.instagram.rtc.connection.connection_id");
        if (string == null) {
            Connection createFailedConnection = Connection.createFailedConnection(new DisconnectCause(1));
            0qQ.A07(createFailedConnection);
            return createFailedConnection;
        }
        String string2 = extras.getString("com.instagram.rtc.connection.display_name");
        if (string2 == null) {
            string2 = "";
        }
        Uri address = connectionRequest.getAddress();
        0qQ.A07(address);
        int videoState = connectionRequest.getVideoState();
        C67665Mrv mrv = new C67665Mrv(A08, r7, string);
        mrv.setConnectionProperties(128);
        mrv.setAddress(address, 1);
        mrv.setCallerDisplayName(string2, 1);
        mrv.setVideoState(videoState);
        mrv.setDialing();
        mrv.setExtras(extras);
        AnonymousClass9IV A00 = 1XD.A00(r7, mrv, string);
        if (A00 == null) {
            return mrv;
        }
        1XD.A03((Bundle) A00.A01, A08, r7, string);
        return mrv;
    }

    public final void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        0qQ.A0B(connectionRequest, 1);
        super.onCreateOutgoingConnectionFailed(phoneAccountHandle, connectionRequest);
        09i.A0A.A08(this);
        1XD r4 = (1XD) AnonymousClass38W.A00().A07.getValue();
        RuntimeException A15 = AnonymousClass7TE.A15("Unable to make outgoing call");
        String A00 = AnonymousClass000.A00(343);
        ConcurrentMap concurrentMap = r4.A03;
        AnonymousClass9IV r0 = (AnonymousClass9IV) concurrentMap.get(A00);
        if (r0 != null) {
            concurrentMap.remove(A00);
            1XD.A04((Bundle) r0.A01, r4, A15);
        }
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(-2077193919);
        super.onCreate();
        AnonymousClass0fD.A0B(441666058, A04);
    }
}
