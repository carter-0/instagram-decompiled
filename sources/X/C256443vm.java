package X;

import android.net.Uri;
import android.util.Log;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.util.Util;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3vm  reason: invalid class name and case insensitive filesystem */
public class C256443vm implements C256453vn {
    public boolean A00 = true;
    public C256423vk A01;
    public final C256243vS A02;
    public final String A03;
    public final AnonymousClass5MV A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARNING: type inference failed for: r1v3, types: [X.3ws] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (X.C257033wk) r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AE0() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C257033wk
            if (r0 == 0) goto L_0x0048
            r0 = r6
            X.3wk r0 = (X.C257033wk) r0
            X.3vS r1 = r0.A02
            if (r1 == 0) goto L_0x0048
            X.29t r5 = r0.A01
            X.3uU r0 = r1.A0D
            if (r0 == 0) goto L_0x0048
            java.lang.String r4 = r0.A0G
            if (r4 == 0) goto L_0x0048
            android.net.Uri r3 = r0.A05
            if (r3 == 0) goto L_0x0048
            java.lang.String r2 = r1.A0G
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r5.A09
            boolean r1 = r1.A0W
            boolean r0 = r0.A3G
            java.lang.String r0 = X.27B.A00(r3, r2, r4, r1, r0)
            r3 = 0
            java.util.Map r2 = r5.A0B
            monitor-enter(r2)
            java.lang.Object r1 = r2.get(r0)     // Catch:{ all -> 0x0045 }
            X.3ws r1 = (X.C257113ws) r1     // Catch:{ all -> 0x0045 }
            boolean r0 = r1 instanceof X.C257133wu     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0036
            r3 = r1
            X.3wu r3 = (X.C257133wu) r3     // Catch:{ all -> 0x0045 }
        L_0x0036:
            monitor-exit(r2)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x0048
            X.3x4 r0 = X.C257233x4.A02
            X.3x5 r0 = r0.A00
            byte r1 = r0.A00
            boolean r0 = r0.A01
            r3.changeHttpPriority(r1, r0)
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0045 }
            throw r0
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256443vm.AE0():void");
    }

    public final void AG6(String str) {
        C257133wu r1;
        String A002 = AnonymousClass000.A00(2118);
        if (this instanceof C257033wk) {
            C257033wk r6 = (C257033wk) this;
            29t r5 = r6.A01;
            C256243vS r12 = r6.A02;
            String str2 = r12.A0G;
            C255653uU r0 = r12.A0D;
            String str3 = r0.A0G;
            String A003 = 27B.A00(r0.A05, str2, str3, r12.A0W, r5.A09.A3G);
            Map map = r5.A0B;
            synchronized (map) {
                C257113ws r13 = (C257113ws) map.get(A003);
                if (r13 instanceof C257133wu) {
                    r1 = (C257133wu) r13;
                } else {
                    r1 = null;
                }
            }
            if (r1 != null) {
                r1.cancel();
            }
            C257033wk.A01(r6, A002);
        }
    }

    public void APw() {
        if (this instanceof C256433vl) {
            ((C256433vl) this).A00.run();
            return;
        }
        throw new UnsupportedOperationException("VodPrefetchTask is a base class. Please use more specific prefetch task");
    }

    public final C256423vk Bff() {
        return this.A01;
    }

    public final void DED() {
        VpsEventCallback vpsEventCallback;
        if (this instanceof C257033wk) {
            C257033wk r2 = (C257033wk) this;
            if (r2.A02 && (vpsEventCallback = r2.A00) != null && r2.A02 != null) {
                vpsEventCallback.callback(C257033wk.A00(r2, "FAIL"));
            }
        }
    }

    public final void Ddg(String str) {
        if (this instanceof C257033wk) {
            C257033wk.A01((C257033wk) this, str);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C256443vm) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public void onComplete() {
        AtomicReference atomicReference;
        int A042;
        long[] jArr;
        long j;
        int i;
        Integer num;
        27s r0;
        C256903wX r1;
        AnonymousClass5MV r8 = this.A04;
        if (r8 != null) {
            int i2 = r8.A01;
            if (i2 == 2) {
                atomicReference = r8.A0A;
            } else {
                atomicReference = r8.A09;
            }
            if (atomicReference != null && atomicReference.get() != null && ((C266184Xw) atomicReference.get()).A02 != null) {
                AnonymousClass4YO r12 = ((C264994Sc) ((C266184Xw) atomicReference.get()).A02).A00;
                if ((r12 instanceof AnonymousClass4YN) && r12 != null && 1 != 0) {
                    AnonymousClass4YN A043 = 2A4.A04(r8.A09);
                    AnonymousClass4YN A044 = 2A4.A04(r8.A0A);
                    if (i2 == 2) {
                        A043 = A044;
                    }
                    if (A043 != null) {
                        C256243vS r6 = r8.A06;
                        long j2 = r6.A08;
                        if (j2 == -1) {
                            jArr = A043.A04;
                            j = (long) r8.A00;
                            A042 = Util.A04(jArr, j, true);
                        } else {
                            A042 = Util.A04(A043.A05, j2 * 1000, true);
                            jArr = A043.A04;
                            j = jArr[A042];
                        }
                        long j3 = r6.A06;
                        int i3 = 0;
                        if (j3 == -1) {
                            int i4 = r6.A04;
                            HeroPlayerSetting heroPlayerSetting = r8.A07.A0A;
                            if (i4 == 1) {
                                i = heroPlayerSetting.A0Z;
                            } else {
                                i = heroPlayerSetting.A0Y;
                            }
                        } else {
                            long j4 = j3 * 1000;
                            long[] jArr2 = A043.A05;
                            long j5 = jArr2[A042];
                            int i5 = A042;
                            while (i5 < A043.A00 && (jArr2[i5] + A043.A03[i5]) - j5 < j4) {
                                i5++;
                            }
                            i = (i5 + 1) - A042;
                        }
                        2A4 r5 = r8.A07;
                        27k r13 = r5.A09;
                        if (r13 == null || 27k.A00(r13, 18) != 1 || ((r0 = r5.A06) != null && r0.A01())) {
                            long j6 = (long) r8.A00;
                            long j7 = jArr[A042];
                            if (j6 > j7) {
                                i3 = (int) (-(j6 - j7));
                            }
                            int i6 = A042;
                            while (i6 < A043.A00 && i6 - A042 < i) {
                                i3 += A043.A02[i6];
                                i6++;
                            }
                            num = AnonymousClass05K.A03;
                        } else {
                            int i7 = r8.A00;
                            C256733wG r132 = r8.A08;
                            int[] iArr = A043.A02;
                            if (!(iArr == null || jArr == null)) {
                                int i8 = (int) jArr[0];
                                for (int i9 : iArr) {
                                    i8 += i9;
                                }
                                if (i8 != 0 && i7 < i8) {
                                    int i10 = (int) (((((double) r132.A02.A05) / 8.0d) * 0.0d) / 1000.0d);
                                    if (i7 + i10 > i8) {
                                        r1 = new C256903wX(i8 - i7, AnonymousClass05K.A0C);
                                    } else {
                                        r1 = new C256903wX(i10, AnonymousClass05K.A0C);
                                    }
                                    i3 = r1.A00;
                                    num = r1.A01;
                                }
                            }
                            r1 = new C256903wX(0, AnonymousClass05K.A00);
                            i3 = r1.A00;
                            num = r1.A01;
                        }
                        if (i3 > 0) {
                            28m r16 = r8.A03;
                            C250813m6 r19 = r8.A05;
                            VpsEventCallback vpsEventCallback = r8.A04;
                            String str = r6.A0D.A0G;
                            int i11 = r6.A04;
                            C256733wG r11 = r8.A08;
                            boolean z = r8.A0D;
                            boolean z2 = r8.A0B;
                            boolean z3 = r8.A0C;
                            long j8 = r8.A02;
                            C256243vS r82 = new C256243vS(r6);
                            r82.A0L = true;
                            r82.A07 = j;
                            r82.A02 = i3;
                            r82.A0E = num;
                            r82.A0F = AnonymousClass05K.A0C;
                            C256423vk r17 = C256423vk.HIGH;
                            HeroPlayerSetting heroPlayerSetting2 = r5.A0A;
                            if (heroPlayerSetting2.A2p) {
                                W14.A02(r82, heroPlayerSetting2);
                            }
                            String str2 = r11.A02.A0T;
                            boolean z4 = false;
                            if (i11 == 2) {
                                z4 = true;
                            }
                            C257033wk A032 = 2A4.A03(r16, r17, vpsEventCallback, r19, r82, (AnonymousClass5MV) null, r5, (C256733wG) null, str, str2, (AtomicReference) null, j8, z4, z, z2, z3);
                            27B.A01("UnifiedPrefetchManager", "Follow up prefetch for video: %s", new Object[]{str});
                            2A4.A06(r5, A032, r82.A0F);
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        long j;
        String str = this.A05;
        C256243vS r7 = this.A02;
        if (r7 != null && r7.A0W) {
            str = 002.A0R(str, "_t");
        }
        if (!this.A06) {
            if (r7 == null) {
                Log.w("VodPrefetchTask", "Trying to lookup prefetch task with insufficient information");
                sb = new StringBuilder();
                sb.append(str);
                sb.append("_track_-1");
            } else {
                Uri uri = r7.A0D.A05;
                if (uri == null) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("_track_");
                    sb.append(r7.A04);
                } else if (r7.A07 == 0) {
                    return uri.toString();
                } else {
                    sb = new StringBuilder();
                    sb.append(uri.toString());
                    sb.append("_");
                    j = r7.A07;
                }
            }
            return sb.toString();
        } else if (r7 == null) {
            return str;
        } else {
            j = r7.A07;
            if (j == 0) {
                return str;
            }
            sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
        }
        sb.append(j);
        return sb.toString();
    }

    public C256443vm(C256423vk r2, C256243vS r3, AnonymousClass5MV r4, String str, String str2, boolean z) {
        this.A02 = r3;
        this.A05 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A01 = r2;
        this.A04 = r4;
    }

    public final int hashCode() {
        return toString().hashCode();
    }
}
