package X;

import android.media.AudioDeviceInfo;
import android.view.Surface;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import java.util.List;

/* renamed from: X.Xv4  reason: case insensitive filesystem */
public abstract class C22078Xv4 implements YCI, Y82 {
    public int A00;
    public Timeline A01;
    public YB5 A02;
    public Y81 A03;
    public C22016XrA A04;
    public final int A05;
    public final S02 A06;
    public final Object A07 = Pxe.A0p();

    public void A01() {
    }

    public final void CIs(int i, Object obj) {
        C10148RnP rnP;
        Surface surface;
        Surface surface2;
        YB9 yb9;
        if (this instanceof C21143XGk) {
            C21143XGk xGk = (C21143XGk) this;
            if (i == 8) {
                xGk.A00 = (Y8K) obj;
            }
        } else if (this instanceof C21144XGl) {
            C21144XGl xGl = (C21144XGl) this;
            if (i == 15) {
                if (!(obj instanceof YB9) || (yb9 = (YB9) obj) == null) {
                    yb9 = YB9.A00;
                }
                xGl.A01 = yb9;
            }
        } else if (this instanceof C21149XGq) {
            C21149XGq xGq = (C21149XGq) this;
            if (i == 1) {
                if (obj instanceof Surface) {
                    surface = (Surface) obj;
                } else {
                    surface = null;
                }
                if (xGq.A02 != surface) {
                    xGq.A02 = surface;
                    C21433Xaj xaj = xGq.A08;
                    C21440Xas xas = xaj.A03;
                    if (xas.A02 != surface) {
                        int i2 = Util.A01;
                        xas.A02 = surface;
                        if (!(i2 < 30 || surface == null || xas.A01 == Integer.MIN_VALUE)) {
                            XUF.A00(surface);
                        }
                    }
                    xaj.A01 = Math.min(xaj.A01, 1);
                }
            } else if (i == 7) {
                obj.getClass();
                xGq.A05 = (Y8H) obj;
            } else if (i == 10) {
                obj.getClass();
                int A0M = AnonymousClass7TE.A0M(obj);
                if (xGq.A01 != A0M) {
                    xGq.A01 = A0M;
                }
            } else if (i == 16) {
                obj.getClass();
                xGq.A00 = AnonymousClass7TE.A0M(obj);
            } else if (i == 4) {
                obj.getClass();
                ((Number) obj).intValue();
            } else if (i == 5) {
                C21433Xaj xaj2 = xGq.A08;
                obj.getClass();
                int A0M2 = AnonymousClass7TE.A0M(obj);
                C21440Xas xas2 = xaj2.A03;
                if (xas2.A01 != A0M2) {
                    xas2.A01 = A0M2;
                    if (Util.A01 >= 30 && (surface2 = xas2.A02) != null && A0M2 != Integer.MIN_VALUE) {
                        XUF.A00(surface2);
                    }
                }
            } else if (i == 13) {
                obj.getClass();
                xGq.A06 = (List) obj;
            } else if (i == 14) {
                obj.getClass();
                C21981Xoa xoa = (C21981Xoa) obj;
                if (xoa.A01 != 0 && xoa.A00 != 0) {
                    xGq.A04 = xoa;
                }
            }
        } else if (this instanceof C21148XGp) {
            C21148XGp xGp = (C21148XGp) this;
            if (i == 2) {
                Y90 y90 = xGp.A03;
                obj.getClass();
                float floatValue = ((Number) obj).floatValue();
                C22084XvA xvA = (C22084XvA) y90;
                if (xvA.A00 != floatValue) {
                    xvA.A00 = floatValue;
                }
            } else if (i == 3) {
                Y90 y902 = xGp.A03;
                obj.getClass();
                SIH sih = (SIH) obj;
                C22084XvA xvA2 = (C22084XvA) y902;
                if (!xvA2.A02.equals(sih)) {
                    xvA2.A02 = sih;
                }
            } else if (i == 6) {
                Y90 y903 = xGp.A03;
                obj.getClass();
                C21474Xc8 xc8 = (C21474Xc8) obj;
                C22084XvA xvA3 = (C22084XvA) y903;
                if (!xvA3.A03.equals(xc8)) {
                    xvA3.A03 = xc8;
                }
            } else if (i == 12) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                C22084XvA xvA4 = (C22084XvA) xGp.A03;
                if (audioDeviceInfo == null) {
                    rnP = null;
                } else {
                    rnP = new C10148RnP(audioDeviceInfo);
                }
                xvA4.A06 = rnP;
            } else if (i == 16) {
                obj.getClass();
                xGp.A00 = AnonymousClass7TE.A0M(obj);
            } else if (i == 9) {
                Y90 y904 = xGp.A03;
                obj.getClass();
                C22084XvA xvA5 = (C22084XvA) y904;
                xvA5.A08 = new C21361XYo(xvA5.A04);
            } else if (i == 10) {
                Y90 y905 = xGp.A03;
                obj.getClass();
                int A0M3 = AnonymousClass7TE.A0M(obj);
                C22084XvA xvA6 = (C22084XvA) y905;
                if (xvA6.A01 != A0M3) {
                    xvA6.A01 = A0M3;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.S02, java.lang.Object] */
    public C22078Xv4(int i) {
        this.A05 = i;
        this.A06 = new Object();
        this.A01 = Timeline.A00;
    }
}
