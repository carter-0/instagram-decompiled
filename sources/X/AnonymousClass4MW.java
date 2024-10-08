package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4MW  reason: invalid class name */
public final class AnonymousClass4MW implements AnonymousClass4MX {
    public final WeakReference A00;

    public final void Dx9() {
    }

    public final void Dxc(C297475ro r5, String str, long j, long j2, boolean z) {
        String str2;
        0qQ.A0B(str, 4);
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A00.get();
        if (r3 != null) {
            Long valueOf = Long.valueOf(j);
            C257393xK r2 = r3.A0M;
            if (r2 != null) {
                r2.Dxh(valueOf.longValue(), str);
            }
            VideoPerformanceProvider videoPerformanceProvider = AnonymousClass4MM.A0p;
            if (videoPerformanceProvider != null) {
                videoPerformanceProvider.onVideoPaused(SystemClock.elapsedRealtime(), str);
            }
            C255653uU r0 = r3.A0I;
            if (r0 != null && (str2 = r0.A0G) != null) {
                AnonymousClass4NZ.A02(str2, r3.A09.A04);
            }
        }
    }

    public final void D7z(long j, String str, boolean z) {
        AnonymousClass4MM r2 = (AnonymousClass4MM) this.A00.get();
        if (r2 != null) {
            if (z) {
                AnonymousClass4MT r1 = r2.A0g;
                r1.A02 = str;
                r1.A00 = (int) j;
            } else {
                r2.A0g.A01 = str;
            }
            C14721U4j u4j = r2.A0P;
            if (u4j != null && z) {
                u4j.A0B = str;
            }
        }
    }

    public final void D80(int i, int i2, int i3, int i4) {
        this.A00.get();
    }

    public final void DAN(AnonymousClass4Yf r5, String str, List list, long j, boolean z) {
        AnonymousClass4MM r3;
        if (list != null && (r3 = (AnonymousClass4MM) this.A00.get()) != null) {
            if ((!r5.equals(r3.A0F) && !r5.equals(r3.A0G)) || !r3.A0m) {
                String str2 = r5.A0E;
                boolean startsWith = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND);
                if (str2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    r3.A0F = r5;
                }
                if (startsWith) {
                    r3.A0G = r5;
                }
                r3.A0E = r5;
                if (r3.A0M != null) {
                    r3.A08(r5, list);
                }
            }
        }
    }

    public final void DGr(String str, long j) {
        AnonymousClass4MM r4 = (AnonymousClass4MM) this.A00.get();
        if (r4 != null && AnonymousClass4NZ.A03()) {
            if (182.A06(0Tu.A05, r4.A0f, 36318960715045650L)) {
                AnonymousClass4NZ.A01(r4.A09.A04, str, j);
            }
        }
    }

    public final void DTt(byte[] bArr, long j) {
        C257393xK r0;
        AnonymousClass4MM r02 = (AnonymousClass4MM) this.A00.get();
        if (r02 != null && (r0 = r02.A0M) != null) {
            r0.DTt(bArr, j);
        }
    }

    public final void DXW() {
        this.A00.get();
    }

    public final void DXX(C297475ro r7, C284815Oa r8, C263684My r9, C263674Mx r10, String str) {
        AnonymousClass4MM r5 = (AnonymousClass4MM) this.A00.get();
        if (r5 != null) {
            C266464Yz r0 = C266464Yz.A0j;
            C266464Yz r4 = r8.A00;
            if (r0 == r4 && !r5.A0e.A25) {
                0wb.A03("local_socket_no_connection", 002.A0b(r8.A02, ", address in use: ", 1yV.A00().A06.hashCode()));
                if (!r5.A0W) {
                    1wS r2 = r5.A0j;
                    if (!r2.A01.A25) {
                        1yV.A00().A05(true);
                        1wS.A04(r2);
                    }
                    r5.A0W = true;
                }
            }
            String str2 = r8.A01.A00;
            String name = r4.name();
            String str3 = r8.A02;
            C257393xK r02 = r5.A0M;
            if (r02 != null) {
                r02.DCm(r5, str2, name, str3);
            }
            C14721U4j u4j = r5.A0P;
            if (u4j != null) {
                u4j.setErrorOrWarningCause(str2, name, str3);
            }
            VideoPerformanceProvider videoPerformanceProvider = AnonymousClass4MM.A0p;
            if (videoPerformanceProvider != null) {
                videoPerformanceProvider.onError(r5.A05(), str2, name, str3);
            }
            if (182.A06(0Tu.A05, r5.A0f, 2342155596196742323L) && str3 != null && Pattern.matches("length=\\d; index=\\d", str3)) {
                0wb.A03("IgGrootPlayer", "ArrayIndexOutOfBoundsException");
            }
        }
    }

    public final void DYz(long j, String str) {
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A00.get();
        if (r3 != null) {
            if (!r3.A0V) {
                C257393xK r0 = r3.A0M;
                if (r0 != null) {
                    r0.DZ2(r3, j);
                }
                C14721U4j u4j = r3.A0P;
                if (u4j != null) {
                    u4j.A06(AnonymousClass05K.A00);
                }
                VideoPerformanceProvider videoPerformanceProvider = AnonymousClass4MM.A0p;
                if (videoPerformanceProvider != null) {
                    videoPerformanceProvider.endStall(r3.A05(), VideoPerformanceProvider.Stalls.INIT);
                }
            }
            r3.A0V = true;
        }
    }

    public final void DZ3() {
        C257393xK r0;
        AnonymousClass4MM r1 = (AnonymousClass4MM) this.A00.get();
        if (r1 != null && (r0 = r1.A0M) != null) {
            r0.DZ4(r1);
        }
    }

    public final void DmP(boolean z) {
        AnonymousClass4MM r7 = (AnonymousClass4MM) this.A00.get();
        if (r7 != null) {
            C257393xK r0 = r7.A0M;
            if (r0 != null) {
                r0.CzE(r7);
            }
            C14721U4j u4j = r7.A0P;
            if (u4j != null) {
                C17603Vav vav = u4j.A0a;
                if (vav.A02) {
                    long[] jArr = vav.A03;
                    if (jArr[1] == 0) {
                        jArr[1] = SystemClock.elapsedRealtime();
                    }
                }
            }
            VideoPerformanceProvider videoPerformanceProvider = AnonymousClass4MM.A0p;
            if (videoPerformanceProvider != null && r7.A0U) {
                videoPerformanceProvider.onVideoPaused(SystemClock.elapsedRealtime(), r7.A05());
                videoPerformanceProvider.onPrepare(r7.A05(), VideoPerformanceProvider.Stalls.BUFFERING);
            }
        }
    }

    public final void DnL(int i) {
        AnonymousClass4MM r5 = (AnonymousClass4MM) this.A00.get();
        if (r5 != null) {
            C257393xK r0 = r5.A0M;
            if (r0 != null) {
                r0.CzD(r5, i);
            }
            C14721U4j u4j = r5.A0P;
            if (u4j != null) {
                u4j.A06(AnonymousClass05K.A01);
            }
            VideoPerformanceProvider videoPerformanceProvider = AnonymousClass4MM.A0p;
            if (videoPerformanceProvider != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                videoPerformanceProvider.endStall(r5.A05(), VideoPerformanceProvider.Stalls.BUFFERING);
                videoPerformanceProvider.onVideoStarted(elapsedRealtime, r5.A05());
            }
        }
    }

    public final void Dpb() {
        this.A00.get();
    }

    public final void Dt7(AnonymousClass4Yf r5, AnonymousClass4Yf r6, String str, String str2, List list, long j) {
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A00.get();
        if (r3 != null) {
            String str3 = r5.A0E;
            boolean startsWith = str3.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND);
            if (str3.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                r3.A0F = r5;
            }
            if (startsWith) {
                r3.A0G = r5;
            }
            r3.A0E = r6;
            C14721U4j u4j = r3.A0P;
            if (u4j != null) {
                u4j.setFormat(r6);
            }
        }
    }

    public final void DxI(C297475ro r3, long j) {
        AnonymousClass4MM r1 = (AnonymousClass4MM) this.A00.get();
        if (r1 == null) {
            return;
        }
        if (r1.A09.A0I.A0X) {
            C257393xK r0 = r1.A0M;
            if (r0 != null) {
                r0.DPP(r1);
                return;
            }
            return;
        }
        C257393xK r02 = r1.A0M;
        if (r02 != null) {
            r02.D5H(r1);
        }
    }

    public final void DyK(int i, int i2, float f) {
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A00.get();
        if (r3 != null) {
            int i3 = i;
            r3.A05 = i3;
            int i4 = i2;
            r3.A04 = i4;
            C257393xK r0 = r3.A0M;
            if (r0 != null) {
                r0.DyJ(r3, f, i3, i4);
            }
            ViewGroup viewGroup = r3.A08;
            if (viewGroup != null) {
                C263624Ms r1 = r3.A09;
                if (r1.A04 != null && r3.A0X && !r3.A0Y) {
                    int width = viewGroup.getWidth();
                    int height = r3.A08.getHeight();
                    View view = r1.A04;
                    double d = ((double) r3.A05) / ((double) r3.A04);
                    0qQ.A0B(view, 2);
                    int i5 = height;
                    if (width > 0 && height > 0 && d > 0.0d) {
                        int i6 = width;
                        double d2 = (double) width;
                        double d3 = (double) height;
                        if (d > (d2 * 1.0d) / d3) {
                            i6 = (int) Math.ceil(d3 * d);
                        } else {
                            i5 = (int) Math.ceil(d2 / d);
                        }
                        int[] iArr = {i6, i5, height, width};
                        int i7 = iArr[0];
                        int i8 = iArr[1];
                        int i9 = iArr[2];
                        Context context = view.getContext();
                        0qQ.A07(context);
                        boolean z = true;
                        if ((context.getApplicationInfo().flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
                            z = false;
                        }
                        int i10 = (width - i7) / 2;
                        if (z) {
                            i10 = -i10;
                        }
                        float f2 = (float) i10;
                        float f3 = (float) ((i9 - i8) / 2);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        0qQ.A0A(layoutParams);
                        0qQ.A0B(layoutParams, 0);
                        if (Math.abs(layoutParams.height - i8) > 5 || Math.abs(layoutParams.width - i7) > 5) {
                            layoutParams.width = i7;
                            layoutParams.height = i8;
                            view.setLayoutParams(layoutParams);
                        }
                        view.setTranslationX(f2);
                        view.setTranslationY(f3);
                    }
                }
            }
        }
    }

    public final void DyU(C263674Mx r15, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        String str6;
        String str7;
        C255653uU r0;
        AnonymousClass4MM r1 = (AnonymousClass4MM) this.A00.get();
        if (r1 != null) {
            if (r15.A0R && (r0 = r1.A0I) != null) {
                String str8 = r0.A0A;
                String str9 = r0.A0G;
                if (str9 != null) {
                    boolean z2 = 1Jk.A07;
                    long j2 = r15.A0G;
                    0qQ.A0B(str8, 1);
                    boolean z3 = AnonymousClass1Jr.A05;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (AnonymousClass1Jr.A05) {
                        AnonymousClass1Jr.A01(new 1Jp(AnonymousClass1Jr.A04, str9, str8, uptimeMillis));
                    }
                    if (1Jk.A07) {
                        1Jk.A05(new 1Jp(1Jk.A01(), str9, str8, j2));
                    }
                }
            }
            C263904Nu r4 = r1.A0L;
            if (!(r4 == null || (str7 = AnonymousClass1QI.A00.A02.A00) == null)) {
                0bb r2 = new 0bb();
                r2.A06("nav_chain", str7);
                r4.A01(r2);
            }
            r1.A08(r1.A0E, (List) null);
            C257393xK r02 = r1.A0M;
            if (r02 != null) {
                r02.DyS(r15.A00());
            }
            VideoPerformanceProvider videoPerformanceProvider = AnonymousClass4MM.A0p;
            if (videoPerformanceProvider != null) {
                videoPerformanceProvider.onVideoStarted(SystemClock.elapsedRealtime(), str5);
                r1.A0U = true;
            }
            C255653uU r03 = r1.A0I;
            if (r03 != null && (str6 = r03.A0G) != null) {
                AnonymousClass5M7 r12 = (AnonymousClass5M7) AnonymousClass4NZ.A07.get(AnonymousClass4NZ.A00(r1.A09.A04, str6));
                if (r12 != null) {
                    long A002 = AnonymousClass5M7.A00();
                    long A01 = AnonymousClass5M7.A01(r12, str6);
                    C17723Vcs vcs = r12.A03;
                    AnonymousClass5M7.A02(r12, "started_playing", vcs.A00, A01, A002);
                    vcs.A09.put(Long.valueOf(A002), Long.valueOf(A01));
                }
            }
        }
    }

    public final void Dzg(boolean z) {
        AnonymousClass4MM r1 = (AnonymousClass4MM) this.A00.get();
        if (r1 != null) {
            C255653uU r0 = r1.A0I;
            if (r0 != null) {
                String str = r0.A0A;
                String str2 = r0.A0G;
                if (str2 != null && !z) {
                    boolean z2 = 1Jk.A07;
                    0qQ.A0B(str, 1);
                    if (AnonymousClass1Jr.A05) {
                        AnonymousClass1Jr.A01(new 1Jp(AnonymousClass1Jr.A04, str2, str, SystemClock.uptimeMillis()));
                    }
                    if (1Jk.A07) {
                        1Jk.A05(new 1Jp(1Jk.A01(), str2, str, SystemClock.uptimeMillis()));
                    }
                }
            }
            AnonymousClass4MO r2 = r1.A0i;
            synchronized (r2) {
                if (z) {
                    AnonymousClass4MS r12 = r2.A00;
                    if (!r12.A02) {
                        r12.A02();
                    }
                } else {
                    AnonymousClass4MS r13 = r2.A00;
                    if (r13.A02) {
                        r13.A03();
                    }
                }
            }
        }
    }

    public final void E06(C284815Oa r5) {
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A00.get();
        if (r3 != null) {
            r3.A07(r5.A00, r5.A01, r5.A02);
        }
    }

    public final void onCues(List list) {
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A00.get();
        if (r3 != null && r3.A0M != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C300015wO) it.next()).A00);
            }
            r3.A0M.D7P(r3, arrayList);
        }
    }

    public final void onDrawnToSurface() {
        C257393xK r0;
        AnonymousClass4MM r1 = (AnonymousClass4MM) this.A00.get();
        if (r1 != null && (r0 = r1.A0M) != null) {
            r0.DB0(r1);
        }
    }

    public final void onSeeking(long j) {
        C257393xK r0;
        AnonymousClass4MM r1 = (AnonymousClass4MM) this.A00.get();
        if (r1 != null && (r0 = r1.A0M) != null) {
            r0.DiU(r1, j);
        }
    }

    public AnonymousClass4MW(AnonymousClass4MM r2) {
        this.A00 = new WeakReference(r2);
    }
}
