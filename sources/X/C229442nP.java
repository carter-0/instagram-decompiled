package X;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import android.view.Window;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.2nP  reason: invalid class name and case insensitive filesystem */
public final class C229442nP {
    public static int A0Z;
    public static boolean A0a;
    public static boolean A0b;
    public static final C229462nR A0c = new C229452nQ();
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06 = new Random().nextInt();
    public final int A07;
    public final AwakeTimeSinceBootClock A08;
    public final AnonymousClass2nZ A09;
    public final AnonymousClass0iw A0A;
    public final 02m A0B;
    public final 0wc A0C;
    public final C229472nS A0D;
    public final C229552ne A0E;
    public final C229462nR A0F;
    public final AnonymousClass2nX A0G = new AnonymousClass2nX();
    public final C229422nM A0H;
    public final 1Jf A0I;
    public final C229402nK A0J;
    public final Boolean A0K;
    public final Boolean A0L;
    public final Runnable A0M;
    public final AnonymousClass0eK A0N;
    public final AnonymousClass0eK A0O;
    public final AnonymousClass0eK A0P;
    public final AnonymousClass0eK A0Q;
    public final AnonymousClass0eK A0R;
    public final AnonymousClass0eK A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final C229532nc A0Y;

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass2nX r1 = this.A0G;
        if (r1.A0C.length() == 0) {
            r1.A0C = str;
        }
    }

    public static final void A00(C229442nP r23) {
        String str;
        Number valueOf;
        Number valueOf2;
        Number valueOf3;
        Number valueOf4;
        0TM r4;
        long j;
        String str2;
        String str3;
        String str4;
        Number number;
        Number number2;
        C229442nP r0 = r23;
        if (r0.A02) {
            AnonymousClass2nX r6 = r0.A0G;
            C229552ne r8 = r0.A0E;
            C229502nY A012 = r8.A01();
            int i = -1;
            int i2 = 0;
            if (r6.A0H) {
                i2 = -1;
            }
            if (!r6.A0G) {
                i = 0;
            }
            r6.A08 = new C229502nY(A012.A01 + i2, A012.A00 + ((float) i));
            AnonymousClass2nZ r2 = r0.A09;
            if (r0.A0U && r2 != null) {
                r2.APC();
            }
            r0.A02 = false;
            AnonymousClass0iw r14 = r0.A0A;
            r14.getModuleName();
            boolean z = r0.A0V;
            if (z) {
                r0.A00++;
            }
            if (r6.A07 > 0 && (!r0.A03 || !r0.A0T || r6.A01 > 0 || r6.A00 > 0)) {
                long now = r0.A08.now();
                String str5 = AnonymousClass1QI.A00.A02.A00;
                if (A01()) {
                    0wc r3 = r0.A0C;
                    0Aj A002 = r3.A00(r3.A00, "feed_scroll_perf");
                    if (A002.isSampled()) {
                        A002.A8D("1_frame_drop_bucket", Double.valueOf((double) r6.A08.A01));
                        A002.A8D("4_frame_drop_bucket", Double.valueOf((double) r6.A08.A00));
                        A002.A8D("display_refresh_rate", Double.valueOf((double) ((Number) r8.A06.getValue()).floatValue()));
                        A002.A8D("total_time_spent", Double.valueOf(((double) r6.A07) / 1000000.0d));
                        A002.AAJ("current_ts_ms", String.valueOf(now));
                        A002.AAJ("startup_ts_ms", String.valueOf(C64031Cc.A08));
                        A002.A7p("is_user_logging_enabled", Boolean.valueOf(A0b));
                        A002.A9F("user_sample_rate", Long.valueOf((long) A0Z));
                        A002.AAJ("startup_type", C64031Cc.A09.toString());
                        A002.AAJ("nav_chain", str5);
                        A002.Cgf();
                    }
                    02m r32 = r0.A0B;
                    int i3 = r0.A07;
                    int i4 = r0.A06;
                    r32.markerAnnotate(i3, i4, "1_frame_drop_bucket", r6.A08.A01);
                    r32.markerAnnotate(i3, i4, "4_frame_drop_bucket", (double) r6.A08.A00);
                    02m r17 = r32;
                    int i5 = i3;
                    int i6 = i4;
                    r17.markerAnnotate(i5, i6, "total_time_spent", r6.A07 / 1000000);
                    r17.markerAnnotate(i5, i6, "total_busy_time_spent", r6.A06 / 1000000);
                    AnonymousClass0Ud r13 = r8.A06;
                    r17.markerAnnotate(i5, i6, "display_refresh_rate", (double) ((Number) r13.getValue()).floatValue());
                    r32.markerAnnotate(i3, i4, "container_module", r14.getModuleName());
                    r32.markerAnnotate(i3, i4, "vsync_time", (int) Math.ceil((double) (1000.0f / ((Number) r13.getValue()).floatValue())));
                    r17.markerAnnotate(i5, i6, "current_ts_ms", now);
                    r32.markerAnnotate(i3, i4, "time_since_startup_bucket", C64031Cc.A01(now));
                    r17.markerAnnotate(i5, i6, "startup_ts_ms", C64031Cc.A08);
                    r32.markerAnnotate(i3, i4, "startup_type", C64031Cc.A09.toString());
                    r32.markerAnnotate(i3, i4, "is_user_logging_enabled", A0b);
                    r32.markerAnnotate(i3, i4, "user_sample_rate", A0Z);
                    r32.markerAnnotate(i3, i4, "is_debug_logging_enabled", A0a);
                    if (z) {
                        r32.markerAnnotate(i3, i4, "num_of_scrolls", r0.A00);
                    }
                    long j2 = -1;
                    if (C64031Cc.A00 != -1) {
                        j2 = System.currentTimeMillis() - C64031Cc.A00;
                    }
                    r17.markerAnnotate(i5, i6, "time_since_upgrade_ms", j2);
                    r32.markerAnnotate(i3, i4, "foreground_cold_start_count_since_upgrade", C64031Cc.A05);
                    r32.markerAnnotate(i3, i4, "all_cold_start_count_since_upgrade", C64031Cc.A04);
                    r17.markerAnnotate(i5, i6, "foreground_timespent_since_upgrade_ms", C64031Cc.A06);
                    1Jf r9 = r0.A0I;
                    r17.markerAnnotate(i5, i6, "heap_free_ratio", r9.A05());
                    switch (r6.A09.intValue()) {
                        case 0:
                            str = "UP";
                            break;
                        case 1:
                            str = "DOWN";
                            break;
                        case 2:
                            str = "LEFT";
                            break;
                        case 3:
                            str = "RIGHT";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    r32.markerAnnotate(i3, i4, "scroll_direction", str);
                    r32.markerAnnotate(i3, i4, "source_media_type", r6.A0D);
                    r32.markerAnnotate(i3, i4, "destination_media_type", r6.A0B);
                    r32.markerAnnotate(i3, i4, "source_description", r6.A0C);
                    r32.markerAnnotate(i3, i4, "destination_description", r6.A0A);
                    boolean z2 = r0.A0X;
                    int i7 = r6.A03;
                    if (z2) {
                        valueOf = Float.valueOf(((float) i7) / r0.A04);
                    } else {
                        valueOf = Integer.valueOf(i7);
                    }
                    r17.markerAnnotate(i5, i6, "scroll_distance_x", valueOf.doubleValue());
                    int i8 = r6.A04;
                    if (z2) {
                        valueOf2 = Float.valueOf(((float) i8) / r0.A04);
                    } else {
                        valueOf2 = Integer.valueOf(i8);
                    }
                    r17.markerAnnotate(i5, i6, "scroll_distance_y", valueOf2.doubleValue());
                    int i9 = r6.A00;
                    if (z2) {
                        valueOf3 = Float.valueOf(((float) i9) / r0.A04);
                    } else {
                        valueOf3 = Integer.valueOf(i9);
                    }
                    r17.markerAnnotate(i5, i6, "agg_scroll_distance_x", valueOf3.doubleValue());
                    int i10 = r6.A01;
                    if (z2) {
                        valueOf4 = Float.valueOf(((float) i10) / r0.A04);
                    } else {
                        valueOf4 = Integer.valueOf(i10);
                    }
                    r17.markerAnnotate(i5, i6, "agg_scroll_distance_y", valueOf4.doubleValue());
                    r32.markerAnnotate(i3, i4, "display_density", r0.A05);
                    if (str5 == null) {
                        str5 = "";
                    }
                    r32.markerAnnotate(i3, i4, "nav_chain", str5);
                    Boolean bool = r0.A0K;
                    if (bool != null) {
                        r32.markerAnnotate(i3, i4, "has_linked_open_thread_id", bool.booleanValue());
                    }
                    AnonymousClass0eK r42 = r0.A0Q;
                    if (r42 != null) {
                        Object obj = r42.get();
                        0qQ.A07(obj);
                        r32.markerAnnotate(i3, i4, "is_vm", ((Boolean) obj).booleanValue());
                    }
                    Boolean bool2 = r0.A0L;
                    if (bool2 != null) {
                        r32.markerAnnotate(i3, i4, "is_mixvm", bool2.booleanValue());
                    }
                    AnonymousClass0eK r43 = r0.A0S;
                    if (r43 != null) {
                        Object obj2 = r43.get();
                        0qQ.A07(obj2);
                        r32.markerAnnotate(i3, i4, "is_mixvm_eligible", ((Boolean) obj2).booleanValue());
                    }
                    AnonymousClass0eK r44 = r0.A0R;
                    if (r44 != null) {
                        Object obj3 = r44.get();
                        0qQ.A07(obj3);
                        r32.markerAnnotate(i3, i4, "is_instamadillo", ((Boolean) obj3).booleanValue());
                    }
                    AnonymousClass0eK r45 = r0.A0N;
                    if (!(r45 == null || (number2 = (Number) r45.get()) == null)) {
                        r17.markerAnnotate(i5, i6, "ephemeral_lifetime_ms", number2.longValue());
                    }
                    AnonymousClass0eK r46 = r0.A0O;
                    if (!(r46 == null || (number = (Number) r46.get()) == null)) {
                        r17.markerAnnotate(i5, i6, C66579MXk.A00(649), number.longValue());
                    }
                    AnonymousClass0eK r47 = r0.A0P;
                    if (!(r47 == null || (str4 = (String) r47.get()) == null)) {
                        r32.markerAnnotate(i3, i4, TraceFieldType.TransportType, str4);
                    }
                    C229402nK r7 = r0.A0J;
                    Integer num = r7.A03;
                    if (num != null) {
                        if (1 - num.intValue() != 0) {
                            str3 = "list";
                        } else {
                            str3 = "grid";
                        }
                        r32.markerAnnotate(i3, i4, "feed_mode", str3);
                    }
                    if (r7.A0B) {
                        r32.markerAnnotate(i3, i4, "is_professional_account", AnonymousClass0t1.A01.A01(r7.A0D).A2L());
                    }
                    2PW r48 = r7.A00;
                    if (!(r48 == null || (r4 = (0TM) r48.A0F.get()) == null)) {
                        for (0TD r82 : r4.A00) {
                            0TJ r49 = 0TJ.A0u;
                            0TJ r5 = r82.A02;
                            if (r49.equals(r5)) {
                                r32.markerAnnotate(i3, i4, "meminfo_current_system_anonymous_kb", r82.A00);
                                j = r82.A01;
                                str2 = "meminfo_total_system_ram_kb";
                            } else if (0TJ.A0V.equals(r5)) {
                                r32.markerAnnotate(i3, i4, "meminfo_current_java_heap_kb", r82.A00);
                                j = r82.A01;
                                str2 = "meminfo_total_java_heap_kb";
                            } else if (0TJ.A11.equals(r5)) {
                                j = r82.A00;
                                str2 = "meminfo_current_system_non_evictable_kb";
                            } else if (0TJ.A0g.equals(r5)) {
                                j = r82.A00;
                                str2 = "meminfo_current_app_ion_heap_kb";
                            } else if (0TJ.A0w.equals(r5)) {
                                j = r82.A00;
                                str2 = "meminfo_current_sys_ion_heap_kb";
                            }
                            r32.markerAnnotate(i3, i4, str2, j);
                        }
                    }
                    Boolean bool3 = r7.A02;
                    if (bool3 != null) {
                        r32.markerAnnotate(i3, i4, "is_group", bool3.booleanValue());
                    }
                    Integer num2 = r7.A04;
                    if (num2 != null) {
                        r32.markerAnnotate(i3, i4, "thread_type_value", num2.intValue());
                    }
                    String str6 = r7.A06;
                    if (str6 != null) {
                        r32.markerAnnotate(i3, i4, "thread_type_str", str6);
                    }
                    String str7 = r7.A05;
                    if (str7 != null) {
                        r32.markerAnnotate(i3, i4, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str7);
                    }
                    if (!r7.A08.isEmpty()) {
                        r32.markerAnnotate(i3, i4, "thread_type_value_list", 1WJ.A04(r7.A08));
                    }
                    if (!r7.A09.isEmpty()) {
                        r32.markerAnnotate(i3, i4, "thread_type_str_list", (String[]) r7.A09.toArray(new String[0]));
                    }
                    if (!r7.A07.isEmpty()) {
                        r32.markerAnnotate(i3, i4, "thread_id_list", (String[]) r7.A07.toArray(new String[0]));
                    }
                    if (r7.A0A) {
                        r32.markerAnnotate(i3, i4, "has_instamadillo_thread", true);
                    }
                    r32.markerEnd(i3, i4, 2);
                    C361488gJ r33 = new C361488gJ();
                    r33.A07 = r14.getModuleName();
                    C229502nY r22 = r6.A08;
                    r33.A03 = r22.A01;
                    r33.A02 = r22.A00;
                    r33.A06 = r6.A07 / 1000000;
                    r33.A05 = r6.A06 / 1000000;
                    r33.A04 = now;
                    r33.A00 = r9.A05();
                    r33.A01 = ((Number) r13.getValue()).floatValue();
                    r33.A08 = r6.A0E;
                    r33.A09 = r6.A0F;
                    r0.A0F.reportScrollForDebugNew(r33);
                }
            } else if (A01()) {
                r0.A0B.markerDrop(r0.A07, r0.A06);
            }
            r0.A0F.onScrollStop();
        }
    }

    public static final boolean A01() {
        if (A0a || A0b) {
            return true;
        }
        return false;
    }

    public final void A03(boolean z) {
        if (z) {
            A00(this);
            return;
        }
        if (!this.A02 && A01()) {
            this.A02 = true;
            this.A0A.getModuleName();
            AnonymousClass2nX r3 = this.A0G;
            r3.A07 = 0;
            r3.A06 = 0;
            r3.A02 = 0;
            r3.A05 = -1;
            r3.A0H = false;
            r3.A0G = false;
            r3.A03 = 0;
            r3.A04 = 0;
            r3.A00 = 0;
            r3.A01 = 0;
            r3.A09 = AnonymousClass05K.A0Y;
            r3.A0C = "";
            r3.A0A = "";
            r3.A0D = "";
            r3.A0B = "";
            r3.A08 = new C229502nY(0, 0.0f);
            r3.A0E = new HashSet();
            r3.A0F = new HashSet();
            this.A0E.A02();
            AnonymousClass2nZ r1 = this.A09;
            if (this.A0U && r1 != null) {
                r1.ARH();
            }
        }
        C229462nR r12 = this.A0F;
        r12.registerModule(this.A0A.getModuleName());
        r12.onScrollStart();
    }

    public C229442nP(Activity activity, AwakeTimeSinceBootClock awakeTimeSinceBootClock, AnonymousClass0iw r15, 02m r16, 0wc r17, C229472nS r18, C229492nU r19, C229462nR r20, C229422nM r21, 1Jf r22, C229402nK r23, Boolean bool, Boolean bool2, AnonymousClass0eK r26, AnonymousClass0eK r27, AnonymousClass0eK r28, AnonymousClass0eK r29, AnonymousClass0eK r30, AnonymousClass0eK r31, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass2nZ r2;
        02z A012;
        AnonymousClass2nZ wh3;
        this.A0A = r15;
        this.A0J = r23;
        this.A07 = i;
        this.A0D = r18;
        02m r3 = r16;
        this.A0B = r3;
        C229462nR r24 = r20;
        this.A0F = r24;
        this.A08 = awakeTimeSinceBootClock;
        this.A0C = r17;
        this.A0I = r22;
        this.A0H = r21;
        this.A0K = bool;
        this.A0Q = r26;
        this.A0L = bool2;
        this.A0S = r27;
        this.A0P = r28;
        this.A0N = r29;
        this.A0O = r30;
        this.A0W = z;
        this.A0U = z3;
        this.A0V = z4;
        this.A0T = z5;
        this.A05 = i2;
        this.A04 = f;
        this.A0X = z6;
        this.A0R = r31;
        r24.registerModule(r15.getModuleName());
        if (z3) {
            Window window = activity.getWindow();
            String moduleName = r15.getModuleName();
            if (window == null) {
                wh3 = new WH2(activity, new VUe(activity, r3, moduleName));
            } else {
                wh3 = new WH3(activity.getWindow(), new VUe(activity, r3, moduleName));
            }
            r2 = wh3;
        } else {
            r2 = null;
        }
        this.A09 = r2;
        this.A0M = new C229512na(this);
        C229522nb r8 = new C229522nb(this);
        this.A0Y = r8;
        0qQ.A0B(r8, 0);
        0qi r1 = C62000qj.A02;
        C229492nU r32 = r19;
        if (r1.A0Y) {
            Context context = r32.A00;
            boolean z7 = r1.A0X;
            float f2 = AnonymousClass2nW.A00;
            A012 = new 02z(Float.valueOf(60.0f));
            C262224Cq r12 = AnonymousClass2nW.A04;
            1Eo.A05(19B.A00, new C58101ImN(context, (AnonymousClass4D7) null, (05G) A012, 80, z7), r12);
        } else {
            A012 = 106.A01(Float.valueOf(AnonymousClass2nW.A03.A00(r32.A00, 80)));
        }
        05F A032 = 10b.A03(A012);
        Choreographer instance = Choreographer.getInstance();
        0qQ.A07(instance);
        this.A0E = new C229552ne((C229572ng) C229552ne.A0B.getValue(), r8, new C229542nd(instance), A032, z2);
    }
}
