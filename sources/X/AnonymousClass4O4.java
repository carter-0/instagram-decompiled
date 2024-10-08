package X;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.4O4  reason: invalid class name */
public final class AnonymousClass4O4 implements AnonymousClass1N3, AnonymousClass0lh {
    public static final Set A0I;
    public int A00;
    public long A01;
    public long A02;
    public Location A03;
    public String A04;
    public HashMap A05;
    public int A06;
    public long A07;
    public 1N8 A08;
    public 1EK A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final Context A0D;
    public final UserSession A0E;
    public final int A0F;
    public final LruCache A0G;
    public final boolean A0H;

    public final synchronized void A03(C263974Ob r10, 0xI r11, AnonymousClass4O3 r12, AnonymousClass3WR r13, String str) {
        int i;
        String str2;
        Location lastLocation;
        String str3;
        if (str != null) {
            if (str.length() != 0 && (i = this.A00) > 0 && Math.abs(str.hashCode() % i) == this.A06) {
                Set set = A0I;
                String str4 = null;
                if (r11 != null) {
                    str2 = r11.A04;
                } else {
                    str2 = null;
                }
                if (00k.A0u(set, str2) || r10 != null) {
                    if (!14i.A08() && this.A0A && this.A0B) {
                        if (!(r13 == null || (str3 = (String) 00k.A0J(r13.A06())) == null || str3.length() == 0)) {
                            LruCache lruCache = 0cp.A00;
                            String host = Uri.parse(str3).getHost();
                            if (!(host == null || host.length() == 0)) {
                                if (r12 != null) {
                                    r12.A1D = host;
                                    if (r11 != null) {
                                        r11.A0C("resource_url", host);
                                    }
                                }
                                if (r10 != null) {
                                    r10.A06("resource_url", host);
                                }
                            }
                        }
                        if (this.A0H) {
                            Location location = null;
                            if (r11 != null) {
                                str4 = r11.A04;
                            }
                            if (!0qQ.A0K(str4, "video_exited") || r10 != null) {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                Object obj = C61970qY.A02(this.A0D).first;
                                if (r12 != null) {
                                    String A002 = A00(str);
                                    r12.A18 = A002;
                                    if (r11 != null) {
                                        r11.A0C("random_session_id", A002);
                                    }
                                }
                                if (r10 != null) {
                                    r10.A06("random_session_id", A00(str));
                                }
                                if (0qQ.A0K(obj, "mobile")) {
                                    A02(r10, r11, r12, this.A05);
                                } else {
                                    if (uptimeMillis - this.A01 > ((long) this.A0C)) {
                                        this.A04 = C276174sn.A00(C60960kU.A00).A03();
                                        this.A01 = uptimeMillis;
                                    }
                                    String str5 = this.A04;
                                    if (!(str5 == null || str5.length() == 0)) {
                                        if (r12 != null) {
                                            r12.A0m = str5;
                                            if (r11 != null) {
                                                r11.A0C("hardware_address", str5);
                                            }
                                        }
                                        if (r10 != null) {
                                            r10.A06("hardware_address", str5);
                                        }
                                    }
                                }
                                if (uptimeMillis - this.A02 > ((long) this.A0C)) {
                                    1Wr r6 = 1Wr.A00;
                                    if (r6 != null) {
                                        location = r6.getLastLocation(this.A0E, "VideoPlayerLoggerNetworkInsightHelper");
                                    }
                                    this.A03 = location;
                                    this.A02 = uptimeMillis;
                                }
                                Location location2 = this.A03;
                                if (location2 != null) {
                                    if (r12 != null) {
                                        Double valueOf = Double.valueOf(location2.getLatitude());
                                        r12.A0B = valueOf;
                                        if (r11 != null) {
                                            r11.A0A("device_lat", valueOf);
                                        }
                                        Double valueOf2 = Double.valueOf(location2.getLongitude());
                                        r12.A0C = valueOf2;
                                        if (r11 != null) {
                                            r11.A0A("device_long", valueOf2);
                                        }
                                    }
                                    if (r10 != null) {
                                        r10.A04("device_lat", Double.valueOf(location2.getLatitude()));
                                        r10.A04("device_long", Double.valueOf(location2.getLongitude()));
                                    }
                                }
                                if (r12 != null) {
                                    Integer valueOf3 = Integer.valueOf(i);
                                    r12.A0X = valueOf3;
                                    if (r11 != null) {
                                        r11.A08(valueOf3, "client_sample_weight");
                                    }
                                }
                                if (r10 != null) {
                                    r10.A05("client_sample_weight", Long.valueOf((long) i));
                                }
                            }
                        } else {
                            if (r12 != null) {
                                String A003 = A00(str);
                                r12.A18 = A003;
                                if (r11 != null) {
                                    r11.A0C("random_session_id", A003);
                                }
                            }
                            if (r10 != null) {
                                r10.A06("random_session_id", A00(str));
                            }
                            if (r12 != null) {
                                String str6 = (String) C61970qY.A02(this.A0D).first;
                                r12.A0q = str6;
                                if (r11 != null) {
                                    r11.A0C("connection_type", str6);
                                }
                            }
                            if (r10 != null) {
                                r10.A06("connection_type", (String) C61970qY.A02(this.A0D).first);
                            }
                            HashMap hashMap = new HashMap();
                            UserSession userSession = this.A0E;
                            AnonymousClass1D8.A00().A0f(hashMap);
                            A02(r10, r11, r12, hashMap);
                            1Wr r1 = 1Wr.A00;
                            if (!(r1 == null || (lastLocation = r1.getLastLocation(userSession, "VideoPlayerLoggerNetworkInsightHelper")) == null)) {
                                if (r12 != null) {
                                    Double valueOf4 = Double.valueOf(lastLocation.getLatitude());
                                    r12.A0B = valueOf4;
                                    if (r11 != null) {
                                        r11.A0A("device_lat", valueOf4);
                                    }
                                    Double valueOf5 = Double.valueOf(lastLocation.getLongitude());
                                    r12.A0C = valueOf5;
                                    if (r11 != null) {
                                        r11.A0A("device_long", valueOf5);
                                    }
                                }
                                if (r10 != null) {
                                    r10.A04("device_lat", Double.valueOf(lastLocation.getLatitude()));
                                    r10.A04("device_long", Double.valueOf(lastLocation.getLongitude()));
                                }
                            }
                            String A032 = C276174sn.A00(C60960kU.A00).A03();
                            if (!(A032 == null || A032.length() == 0)) {
                                if (r12 != null) {
                                    r12.A0m = A032;
                                    if (r11 != null) {
                                        r11.A0C("hardware_address", A032);
                                    }
                                }
                                if (r10 != null) {
                                    r10.A06("hardware_address", A032);
                                }
                            }
                            if (r12 != null) {
                                Integer valueOf6 = Integer.valueOf(i);
                                r12.A0X = valueOf6;
                                if (r11 != null) {
                                    r11.A08(valueOf6, "client_sample_weight");
                                }
                            }
                            if (r10 != null) {
                                r10.A05("client_sample_weight", Long.valueOf((long) i));
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ImmutableSet A022 = ImmutableSet.A02("video_paused", "video_started_playing", "video_buffering_started", "video_buffering_finished", "video_exited", "video_should_start", new String[]{"video_playing_update"});
        0qQ.A07(A022);
        A0I = A022;
    }

    private final String A00(String str) {
        LruCache lruCache = this.A0G;
        String str2 = (String) lruCache.get(str);
        if (str2 != null) {
            return str2;
        }
        String obj = AnonymousClass0HM.A00().toString();
        lruCache.put(str, obj);
        return obj;
    }

    private final void A01() {
        Long l;
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str3;
        1N8 r1 = this.A08;
        if (r1 != null && this.A09 != null) {
            HashMap hashMap = new HashMap();
            C268194cw r4 = new C268194cw(C269474fB.A00);
            Integer num5 = null;
            r4.A0E(TraceFieldType.NetworkType, r1.A08);
            1N8 r0 = this.A08;
            if (r0 != null) {
                l = Long.valueOf(r0.A05);
            } else {
                l = null;
            }
            if (l != null) {
                long longValue = l.longValue();
                if (longValue != Long.MAX_VALUE) {
                    r4.A0D("ci", longValue);
                }
            }
            1N8 r02 = this.A08;
            if (r02 != null) {
                str = r02.A06;
            } else {
                str = null;
            }
            if (!(str == null || str.length() == 0)) {
                r4.A0E("mcc", str);
            }
            1N8 r03 = this.A08;
            if (r03 != null) {
                str2 = r03.A07;
            } else {
                str2 = null;
            }
            if (!(str2 == null || str2.length() == 0)) {
                r4.A0E("mnc", str2);
            }
            1N8 r04 = this.A08;
            if (r04 != null) {
                num = Integer.valueOf(r04.A04);
            } else {
                num = null;
            }
            C282625Dz.A00(r4, num, "tac");
            1EK r05 = this.A09;
            if (r05 != null) {
                num2 = Integer.valueOf(r05.A04);
            } else {
                num2 = null;
            }
            C282625Dz.A00(r4, num2, "signal_dbm");
            1EK r06 = this.A09;
            if (r06 != null) {
                num3 = Integer.valueOf(r06.A06);
            } else {
                num3 = null;
            }
            C282625Dz.A00(r4, num3, "lte_rsrq");
            1EK r07 = this.A09;
            if (r07 != null) {
                num4 = Integer.valueOf(r07.A08);
            } else {
                num4 = null;
            }
            C282625Dz.A00(r4, num4, "lte_rssnr");
            1EK r08 = this.A09;
            if (r08 != null) {
                num5 = Integer.valueOf(r08.A07);
            }
            C282625Dz.A00(r4, num5, "lte_rssi");
            1DI A002 = AnonymousClass1D8.A00();
            0qQ.A07(A002);
            if (A002.A0R) {
                r4.A0E("nr_state", "CONNECTED");
            }
            1DF r09 = A002.A03;
            if (r09 != null) {
                str3 = r09.A00.getSimOperator();
            } else {
                str3 = null;
            }
            if (!(str3 == null || str3.length() == 0)) {
                r4.A0E("sim_operator_mcc_mnc", str3);
            }
            hashMap.put("network_params", r4.toString());
            this.A05 = hashMap;
        }
    }

    public static final void A02(C263974Ob r2, 0xI r3, AnonymousClass4O3 r4, HashMap hashMap) {
        if (r4 != null) {
            r4.A1Q = hashMap;
            if (r3 != null) {
                r3.A0F(hashMap);
            }
        }
        if (r2 != null) {
            r2.A06("network_generation", (String) hashMap.get("network_generation"));
            r2.A06("network_params", (String) hashMap.get("network_params"));
            r2.A06("network_type_info", (String) hashMap.get("network_type_info"));
            r2.A03("is_network_roaming", Boolean.valueOf(Boolean.parseBoolean((String) hashMap.get("is_network_roaming"))));
        }
    }

    public final void onCellIdentityChanged(1N8 r3) {
        synchronized (this.A05) {
            this.A08 = r3;
            A01();
        }
    }

    public final void onCellSignalStrengthChanged(1EK r9) {
        synchronized (this.A05) {
            this.A09 = r9;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.A07 > ((long) this.A0F)) {
                A01();
                this.A07 = uptimeMillis;
            }
        }
    }

    public final void onSessionWillEnd() {
        if (this.A0H) {
            AnonymousClass1D8.A00().A0K.remove(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.AnonymousClass1D8.A00().A0g() == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4O4(android.content.Context r6, com.instagram.common.session.UserSession r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.A0D = r6
            r5.A0E = r7
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314292085459457(0x8103a800060a01, double:3.0286427685373245E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x001f
            X.1DI r0 = X.AnonymousClass1D8.A00()
            boolean r0 = r0.A0g()
            r3 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            r5.A0H = r3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.A05 = r0
            if (r3 == 0) goto L_0x0092
            r0 = 36595767061842170(0x8203a8000108fa, double:3.206648677010508E-306)
        L_0x0030:
            long r0 = X.182.A01(r2, r7, r0)
            int r4 = (int) r0
            r5.A00 = r4
            if (r4 > 0) goto L_0x0088
            r0 = -1
        L_0x003a:
            r5.A06 = r0
            r0 = 36595767062104317(0x8203a8000508fd, double:3.206648677176291E-306)
            long r0 = X.182.A01(r2, r7, r0)
            int r4 = (int) r0
            r0 = 5000(0x1388, float:7.006E-42)
            if (r4 > 0) goto L_0x0083
            r4 = 1000(0x3e8, float:1.401E-42)
        L_0x004c:
            android.util.LruCache r0 = new android.util.LruCache
            r0.<init>(r4)
            r5.A0G = r0
            r0 = 36595767061973244(0x8203a8000308fc, double:3.2066486770934E-306)
            long r0 = X.182.A01(r2, r7, r0)
            int r4 = (int) r0
            r5.A0C = r4
            r0 = 36595767062235390(0x8203a8000708fe, double:3.206648677259182E-306)
            long r1 = X.182.A01(r2, r7, r0)
            int r0 = (int) r1
            r5.A0F = r0
            if (r3 == 0) goto L_0x0074
            X.1DI r0 = X.AnonymousClass1D8.A00()
            r0.A0d(r5)
        L_0x0074:
            boolean r0 = X.1Wr.isLocationEnabled(r6)
            r5.A0A = r0
            java.lang.String r0 = "VIDEO_PLAYER_LOGGER"
            boolean r0 = X.1Wr.isLocationPermitted(r6, r7, r0)
            r5.A0B = r0
            return
        L_0x0083:
            if (r4 <= r0) goto L_0x004c
            r4 = 5000(0x1388, float:7.006E-42)
            goto L_0x004c
        L_0x0088:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r0 = r0.nextInt(r4)
            goto L_0x003a
        L_0x0092:
            r0 = 36595767061907707(0x8203a8000208fb, double:3.206648677051954E-306)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4O4.<init>(android.content.Context, com.instagram.common.session.UserSession):void");
    }
}
