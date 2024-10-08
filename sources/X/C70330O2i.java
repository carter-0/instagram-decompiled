package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;

/* renamed from: X.O2i  reason: case insensitive filesystem */
public abstract class C70330O2i {
    public static final DirectMessageInteropReachabilityOptions A00(String str) {
        for (DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions : DirectMessageInteropReachabilityOptions.values()) {
            if (0qQ.A0K(directMessageInteropReachabilityOptions.A03, str)) {
                return directMessageInteropReachabilityOptions;
            }
        }
        return null;
    }
}
