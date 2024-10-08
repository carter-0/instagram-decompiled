package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class GE1 extends C270664h6 implements JRJ, AnonymousClass32U {
    public Integer A00;
    public int A01 = -1;
    public int A02 = -1;
    public Integer A03 = AnonymousClass05K.A00;
    public boolean A04 = true;
    public final Map A05 = AnonymousClass7TE.A1H();
    public final Context A06;
    public final UserSession A07;
    public final C57097IOl A08;
    public final C227352j4 A09;
    public final String A0A;
    public final C62320sa A0B;

    public GE1(Context context, UserSession userSession, C227352j4 r6, String str, C62320sa r8) {
        0qQ.A0B(str, 4);
        this.A07 = userSession;
        this.A06 = context;
        this.A0B = r8;
        this.A0A = str;
        this.A09 = r6;
        this.A08 = (C57097IOl) userSession.A01(C57097IOl.class, new C58709IwI(userSession, 29));
    }

    public final void D3r(H3D h3d) {
        GPQ gpq;
        C2366634p r0;
        Integer num = this.A00;
        if (!(num == null || (gpq = (GPQ) this.A05.get(num)) == null || (r0 = gpq.A01) == null)) {
            r0.A01();
        }
        this.A00 = null;
    }

    public final void D3u(C52263GLe gLe) {
        GPQ gpq;
        C2366634p r0;
        0qQ.A0B(gLe, 0);
        if (!1KU.A03(this.A07) || gLe.A0C) {
            Integer num = this.A00;
            if (!(num == null || (gpq = (GPQ) this.A05.get(num)) == null || (r0 = gpq.A01) == null)) {
                r0.A05();
            }
            this.A00 = null;
        }
    }

    public final void DAz(int i) {
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final void DhG(float f, float f2) {
    }

    public final void DhU(Integer num) {
        Integer num2;
        C295365o2 r0;
        0qQ.A0B(num, 0);
        this.A03 = num;
        int i = this.A01;
        if (i != -1) {
            boolean z = true;
            int i2 = i + 1;
            GD6 gd6 = (GD6) this.A0B.invoke();
            if (this.A04 && num == (num2 = AnonymousClass05K.A01)) {
                this.A08.A00 = false;
                Map map = this.A05;
                Integer valueOf = Integer.valueOf(i2);
                if (map.containsKey(valueOf)) {
                    0f9 AEf = 0wj.A01.AEf("ClipsViewerTransitionLogger", 817902720);
                    AEf.ABQ(DialogModule.KEY_MESSAGE, "Did not cleanup position based transition logger when user swiped out");
                    AEf.report();
                    map.remove(valueOf);
                }
                GPR gpr = new GPR(map, i2);
                GPQ gpq = new GPQ(this.A06, this.A07, gpr);
                map.put(valueOf, gpq);
                this.A04 = false;
                this.A02 = this.A01;
                C52009GBg gBg = gd6.A0A;
                if (i2 >= gBg.A0A()) {
                    gpq.A0N();
                    C2366634p A022 = gpq.A02("network_request");
                    gpq.A01 = A022;
                    A022.A04();
                    gpq.A0K("is_at_end_of_feed", true);
                    gpq.A0G("page", i2);
                    gpq.A0J("clips_viewer_source", this.A0A);
                    return;
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                int ordinal = gBg.A0E(i2).A01.ordinal();
                if (ordinal == 8) {
                    C2366634p A023 = gpq.A02("network_request");
                    gpq.A01 = A023;
                    A1C.add(A023);
                    this.A00 = valueOf;
                } else if (ordinal == 0) {
                    C2366634p A024 = gpq.A02("media_load");
                    gpq.A00 = A024;
                    A1C.add(A024);
                }
                gpq.A0N();
                Iterator A1G = AnonymousClass7TE.A1G(A1C);
                while (A1G.hasNext()) {
                    Object next = A1G.next();
                    0qQ.A07(next);
                    ((C2366634p) next).A08((String) null);
                }
                gpq.A0G("page", i2);
                gpq.A0J("clips_viewer_source", this.A0A);
                gpq.A0K("is_waiting_for_network_response", AnonymousClass7TF.A1W(gBg.A0E(i2).A01, C295365o2.GHOST));
                if (gBg.A0E(i2).A03 != num2) {
                    z = false;
                }
                gpq.A0K("is_from_flash_cache", z);
                C267324bN A0E = gBg.A0E(i2);
                if (A0E != null && (r0 = A0E.A01) != null) {
                    gpq.A0J(TraceFieldType.ContentType, GIO.A00(r0));
                }
            } else if (num == AnonymousClass05K.A00) {
                if (this.A02 == this.A01) {
                    int A002 = GD6.A00(gd6);
                    Map map2 = this.A05;
                    if (i2 >= A002) {
                        GPQ gpq2 = (GPQ) C51968G9o.A10(map2, i2);
                        if (gpq2 != null) {
                            gpq2.A0J(TraceFieldType.FailureReason, "End of feed");
                            C2366634p r02 = gpq2.A01;
                            if (r02 != null) {
                                r02.A01();
                            }
                        }
                    } else {
                        Integer valueOf2 = Integer.valueOf(i2);
                        GPQ gpq3 = (GPQ) map2.get(valueOf2);
                        if (gpq3 != null && !gpq3.A02) {
                            C252423p5 r03 = (C252423p5) map2.get(valueOf2);
                            if (r03 != null) {
                                r03.A06();
                            }
                            map2.remove(valueOf2);
                        }
                    }
                }
                this.A04 = true;
            }
        }
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void Dxj(C267324bN r1, int i) {
    }

    public final void Dxk(int i, boolean z) {
    }

    public final void Dxr(int i) {
    }

    public final void Dxs(int i, boolean z) {
    }

    public final void Dxt(int i) {
    }

    public final void DyX(C376449Ia r4, int i) {
        this.A08.A00 = true;
        GPQ gpq = (GPQ) C51968G9o.A10(this.A05, i);
        if (gpq != null) {
            gpq.A0K("is_video_cached", r4.A03);
            gpq.A0J("is_video_init_segment_cached", ((C257183wz) r4.A02).name());
            gpq.A0J("is_video_first_data_segment_cached", ((C257183wz) r4.A01).name());
            gpq.A0K("is_video_player_warmed", r4.A04);
            C2366634p r0 = gpq.A00;
            if (r0 != null) {
                r0.A05();
            }
            gpq.A00 = null;
        }
    }

    public final void DyZ(int i) {
    }

    public final void Dya(int i) {
    }

    public final void Dyb(int i) {
    }

    public final void Dyc(int i, String str) {
    }

    public final void Dyd(int i) {
    }

    public final void DWA(int i, int i2) {
        Map map;
        Integer num;
        C314066hb r0;
        if (i != i2) {
            this.A01 = i;
            if (i == this.A02 + 1 && (r0 = (C314066hb) C51968G9o.A10(this.A05, i)) != null) {
                r0.A0M();
            }
            if (this.A03 != AnonymousClass05K.A00) {
                if (!this.A09.CW7() || (num = this.A00) == null || i2 != num.intValue()) {
                    map = this.A05;
                    Integer valueOf = Integer.valueOf(i2);
                    C252423p5 r02 = (C252423p5) map.get(valueOf);
                    if (r02 != null) {
                        r02.A07();
                    }
                    map.remove(valueOf);
                } else {
                    map = this.A05;
                    GPQ gpq = (GPQ) map.get(num);
                    if (gpq != null) {
                        gpq.A0J(TraceFieldType.FailureReason, "Last item and network request failed");
                        C2366634p r03 = gpq.A01;
                        if (r03 != null) {
                            r03.A01();
                        }
                    }
                    this.A00 = null;
                }
                if (i == i2 - 1) {
                    Integer valueOf2 = Integer.valueOf(i2 + 1);
                    C252423p5 r04 = (C252423p5) map.get(valueOf2);
                    if (r04 != null) {
                        r04.A06();
                    }
                    map.remove(valueOf2);
                }
            }
            this.A04 = true;
        }
    }

    public final void DXk(int i, String str) {
        Map map = this.A05;
        Integer valueOf = Integer.valueOf(i);
        GPQ gpq = (GPQ) map.get(valueOf);
        if (gpq != null) {
            if (str == null) {
                str = "Missing video player failure reason";
            }
            gpq.A0J(TraceFieldType.FailureReason, str);
            C2366634p r0 = gpq.A00;
            if (r0 != null) {
                r0.A01();
            }
            gpq.A00 = null;
        }
        map.remove(valueOf);
    }

    public final void DyP(int i) {
        GPQ gpq = (GPQ) C51968G9o.A10(this.A05, i);
        if (gpq != null && !gpq.A03 && gpq.A01) {
            C2366634p r1 = gpq.A00;
            if (r1 != null) {
                r1.A04();
            }
            gpq.A03 = true;
        }
    }
}
