package X;

import androidx.media3.common.Timeline;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

public final class Xn2 {
    public C21484Xcb A00;
    public ImmutableList A01 = ImmutableList.of();
    public ImmutableMap A02 = RegularImmutableMap.A02;
    public final XcO A03;

    public static C21484Xcb A00(C22546Y8v y8v, ImmutableList immutableList) {
        int A05;
        C22056Xui xui = (C22056Xui) y8v;
        Timeline A04 = C21055XCg.A04(xui);
        C22056Xui.A02(xui);
        C22009Xqt xqt = xui.A0A;
        Timeline timeline = xqt.A06;
        if (AnonymousClass7TF.A1Q(timeline.A02())) {
            A05 = 0;
        } else {
            A05 = timeline.A05(xqt.A09.A04);
        }
        if (AnonymousClass7TF.A1Q(A04.A02())) {
            C22056Xui.A02(xui);
            for (int i = 0; i < immutableList.size(); i++) {
                C21484Xcb xcb = (C21484Xcb) immutableList.get(i);
                C22056Xui.A02(xui);
                C22056Xui.A02(xui);
                C22056Xui.A02(xui);
                JTQ.A1O(-1, -1);
                C22056Xui.A02(xui);
                C22056Xui.A02(xui);
                JTQ.A1O(-1, -1);
                if (xcb.A04.equals((Object) null)) {
                    return xcb;
                }
            }
            immutableList.isEmpty();
            return null;
        }
        A04.A08(A05);
        throw AnonymousClass00P.createAndThrow();
    }

    public Xn2(XcO xcO) {
        this.A03 = xcO;
    }
}
