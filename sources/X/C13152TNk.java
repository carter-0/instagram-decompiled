package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.concurrent.Callable;

/* renamed from: X.TNk  reason: case insensitive filesystem */
public final class C13152TNk implements Callable {
    public final /* synthetic */ ReadableArray A00;
    public final /* synthetic */ ReadableMap A01;
    public final /* synthetic */ IgNetworkingModule A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C13152TNk(ReadableArray readableArray, ReadableMap readableMap, IgNetworkingModule igNetworkingModule, String str, String str2) {
        this.A02 = igNetworkingModule;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = readableArray;
        this.A01 = readableMap;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1QS access$200 = this.A02.buildRequest(this.A03, this.A04, this.A00, this.A01);
        AnonymousClass1QT A0E = JTQ.A0E();
        A0E.A03 = 1Fe.A03;
        return Pxf.A0R(access$200, A0E);
    }
}
