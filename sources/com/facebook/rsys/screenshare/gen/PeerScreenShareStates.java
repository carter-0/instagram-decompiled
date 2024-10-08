package com.facebook.rsys.screenshare.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

public class PeerScreenShareStates {
    public static 2LV CONVERTER = new C71545Omg(2);
    public static long sMcfTypeId;
    public final HashSet screenSharingPeers;
    public final Map screenSharingSourcePerUserId;

    public static native PeerScreenShareStates createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PeerScreenShareStates)) {
                return false;
            }
            PeerScreenShareStates peerScreenShareStates = (PeerScreenShareStates) obj;
            if (!this.screenSharingPeers.equals(peerScreenShareStates.screenSharingPeers)) {
                return false;
            }
            Map map = this.screenSharingSourcePerUserId;
            Map map2 = peerScreenShareStates.screenSharingSourcePerUserId;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int hashCode;
        int A01 = C66583MXo.A01(this.screenSharingPeers.hashCode());
        Map map = this.screenSharingSourcePerUserId;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return A01 + hashCode;
    }

    public PeerScreenShareStates(HashSet hashSet, Map map) {
        hashSet.getClass();
        this.screenSharingPeers = hashSet;
        this.screenSharingSourcePerUserId = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PeerScreenShareStates{screenSharingPeers=");
        A1A.append(this.screenSharingPeers);
        A1A.append(",screenSharingSourcePerUserId=");
        return C66582MXn.A0v(this.screenSharingSourcePerUserId, A1A);
    }
}
