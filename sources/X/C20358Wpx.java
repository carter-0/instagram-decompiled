package X;

import com.instagram.model.reels.Reel;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Wpx  reason: case insensitive filesystem */
public final /* synthetic */ class C20358Wpx implements Runnable {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ AnonymousClass3PK A01;
    public final /* synthetic */ AnonymousClass3BV A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ Map A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ Map A09;
    public final /* synthetic */ Set A0A;
    public final /* synthetic */ Set A0B;
    public final /* synthetic */ Set A0C;

    public /* synthetic */ C20358Wpx(Reel reel, AnonymousClass3PK r2, AnonymousClass3BV r3, Boolean bool, String str, String str2, Map map, Map map2, Map map3, Map map4, Set set, Set set2, Set set3) {
        this.A02 = r3;
        this.A00 = reel;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = map;
        this.A0B = set;
        this.A08 = map2;
        this.A0C = set2;
        this.A09 = map3;
        this.A0A = set3;
        this.A06 = map4;
        this.A03 = bool;
    }

    public final void run() {
        AnonymousClass3BV r2 = this.A02;
        Reel reel = this.A00;
        AnonymousClass3PK r1 = this.A01;
        String str = this.A04;
        String str2 = this.A05;
        Map map = this.A07;
        Set set = this.A0B;
        Map map2 = this.A08;
        Set set2 = this.A0C;
        Map map3 = this.A09;
        Set set3 = this.A0A;
        AnonymousClass3BV.A02(reel, r1, r2, this.A03, str, str2, map, map2, map3, this.A06, set, set2, set3);
    }
}
