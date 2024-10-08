package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.3LO  reason: invalid class name */
public final class AnonymousClass3LO extends 0Yg implements 0sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ Integer A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3LO(UserSession userSession, Integer num, int i, int i2, int i3, int i4) {
        super(4);
        this.A04 = userSession;
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A05 = num;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        int intValue = ((Number) obj3).intValue();
        int intValue2 = ((Number) obj4).intValue();
        0qQ.A0B(str2, 0);
        0qQ.A0B(str3, 1);
        1Zp A002 = 1Zm.A00(this.A04).A00(AnonymousClass05K.A0Q, 817898837, 0, true);
        A002.A03("source", str2);
        A002.A03("destination", str3);
        A002.A01("repeated_count", intValue);
        A002.A01("avg_interval", intValue2);
        A002.A01("config_time_window", this.A03);
        A002.A01("config_repeat_count", this.A02);
        A002.A01("config_avg_interval", this.A00);
        A002.A01("config_max_interval", this.A01);
        switch (this.A05.intValue()) {
            case 0:
                str = NetInfoModule.CONNECTION_TYPE_NONE;
                break;
            case 1:
                i = 4025;
                break;
            case 2:
                i = 2992;
                break;
            default:
                i = 4022;
                break;
        }
        str = AnonymousClass000.A00(i);
        A002.A03("config_detection_mode", str);
        A002.A03("nav_path", 002.A0g(str2, "->", str3));
        A002.A03("logview_group_by", "nav_path");
        A002.A00();
        return C60340gF.A00;
    }
}
