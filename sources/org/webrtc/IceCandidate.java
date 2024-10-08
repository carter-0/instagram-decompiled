package org.webrtc;

import X.AnonymousClass7TE;
import X.DbW;
import X.Pxf;
import java.util.Arrays;
import org.webrtc.PeerConnection;

public class IceCandidate {
    public final PeerConnection.AdapterType adapterType;
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    public static boolean objectEquals(Object obj, Object obj2) {
        if (obj == null) {
            return DbW.A1a(obj2);
        }
        return obj.equals(obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        if (!objectEquals(this.sdpMid, iceCandidate.sdpMid) || this.sdpMLineIndex != iceCandidate.sdpMLineIndex || !objectEquals(this.sdp, iceCandidate.sdp)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.sdpMid, Integer.valueOf(this.sdpMLineIndex), this.sdp});
    }

    public IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = str3;
        this.adapterType = adapterType2;
    }

    public String getSdp() {
        return this.sdp;
    }

    public String getSdpMid() {
        return this.sdpMid;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.sdpMid);
        A1A.append(":");
        A1A.append(this.sdpMLineIndex);
        A1A.append(":");
        A1A.append(this.sdp);
        A1A.append(":");
        A1A.append(this.serverUrl);
        A1A.append(":");
        Pxf.A1O(A1A, this.adapterType);
        return A1A.toString();
    }

    public IceCandidate(String str, int i, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = "";
        this.adapterType = PeerConnection.AdapterType.UNKNOWN;
    }
}
