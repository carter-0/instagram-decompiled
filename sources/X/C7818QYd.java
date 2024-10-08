package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.QYd  reason: case insensitive filesystem */
public final class C7818QYd extends SIU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C11404SSb A03;
    public final C12220SpN A04;

    public C7818QYd(C11404SSb sSb, ReadableMap readableMap) {
        this.A03 = sSb;
        this.A04 = C12220SpN.A00(readableMap.getMap("animationConfig"));
        this.A00 = readableMap.getInt("animationId");
        this.A01 = readableMap.getInt("toValue");
        this.A02 = readableMap.getInt(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "TrackingAnimatedNode[", A1A);
        A1A.append("]: animationID: ");
        A1A.append(this.A00);
        A1A.append(" toValueNode: ");
        A1A.append(this.A01);
        A1A.append(" valueNode: ");
        A1A.append(this.A02);
        A1A.append(" animationConfig: ");
        return AnonymousClass7TF.A0i(this.A04, A1A);
    }
}
