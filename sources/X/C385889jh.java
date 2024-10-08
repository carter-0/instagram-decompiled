package X;

import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.9jh  reason: invalid class name and case insensitive filesystem */
public final class C385889jh extends 2Cn {
    public String A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final /* synthetic */ int A02;
    public final /* synthetic */ C353498Hw A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void onFail(Exception exc) {
        Exception exc2 = exc;
        0qQ.A0B(exc, 0);
        C353498Hw r0 = this.A03;
        String str = this.A00;
        if (str == null) {
            str = "";
        }
        C353498Hw.A16(r0, exc2, str, "prefillMediums failed", true, true);
    }

    public C385889jh(C353498Hw r2, int i, boolean z, boolean z2, boolean z3) {
        this.A03 = r2;
        this.A02 = i;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r2 = r3.A03;
        r1 = r2.A1d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r3 = this;
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0019
            X.8Hw r2 = r3.A03
            X.85M r1 = r2.A1d
            android.widget.FrameLayout r0 = r1.A00
            if (r0 == 0) goto L_0x0019
            X.AnonymousClass7TG.A19(r0, r1)
            r0 = 0
            r1.A00 = r0
            X.C353498Hw.A0m(r2)
        L_0x0019:
            return
        L_0x001a:
            X.8Hw r0 = r3.A03
            X.85M r0 = r0.A1d
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385889jh.onFinish():void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        RuntimeException A15;
        int i;
        List BrX;
        C279454yf r5;
        List list = (List) obj;
        0qQ.A0B(list, 0);
        if (list.isEmpty()) {
            A15 = AnonymousClass7TE.A15("zero videos imported");
        } else {
            C353498Hw r0 = this.A03;
            FragmentActivity activity = r0.A1B.getActivity();
            if (activity != null && !activity.isFinishing()) {
                int i2 = this.A02;
                C353498Hw.A0u(r0, i2);
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C349307zv r2 = (C349307zv) it.next();
                        if (r2 == null) {
                            A15 = AnonymousClass7TE.A15("video is null");
                            break;
                        }
                        AnonymousClass7TF.A1M(A1C, r2.A07);
                    } else {
                        List A012 = C18185Vmz.A01(A1C, i2);
                        if (list.size() != A012.size()) {
                            A15 = AnonymousClass7TE.A15("videos size differs from finalVideoDurations size");
                        } else {
                            ListIterator listIterator = list.listIterator();
                            while (listIterator.hasNext()) {
                                int nextIndex = listIterator.nextIndex();
                                C349307zv r22 = (C349307zv) listIterator.next();
                                if (r22 == null) {
                                    A15 = AnonymousClass7TE.A15("video is null");
                                } else if (r22.A07 <= 0) {
                                    A15 = AnonymousClass7TE.A15("video with <= 0 duration");
                                } else {
                                    this.A00 = r22.A07();
                                    if (!listIterator.hasNext() && !this.A05) {
                                        r0.A0m = true;
                                    }
                                    C56077HsQ hsQ = (C56077HsQ) 00k.A0O(A012, nextIndex);
                                    if (hsQ != null) {
                                        if (this.A06) {
                                            C270564gw r52 = ((C3511387s) r0.A27.getValue()).A04;
                                            if (r52 != null && (BrX = r52.BrX()) != null && (r5 = (C279454yf) 00k.A0O(BrX, nextIndex)) != null) {
                                                i = (int) r5.getDurationInMs();
                                            } else {
                                                return;
                                            }
                                        } else {
                                            i = hsQ.A00;
                                        }
                                        Integer valueOf = Integer.valueOf(i);
                                        if (valueOf != null) {
                                            int intValue = valueOf.intValue();
                                            if (this.A05) {
                                                int i3 = 54;
                                                if (r22.A0F != 54) {
                                                    i3 = 1;
                                                }
                                                File A07 = C353498Hw.A07(r0, AnonymousClass7TE.A0t(r22.A0k));
                                                if (A07 != null) {
                                                    int i4 = r22.A07;
                                                    String A062 = r22.A06();
                                                    AnonymousClass51M A063 = C353498Hw.A06(ImmutableList.of(), r0.A1m.A00(), r0, r22, A07, A062, AnonymousClass7TE.A1C(), i3, i4, hsQ.A01, intValue, false, false);
                                                    List list2 = this.A01;
                                                    list2.add(A063);
                                                    C353498Hw.A0p(r0);
                                                    if (!listIterator.hasNext()) {
                                                        r0.A1n.A0i(list2);
                                                    }
                                                }
                                            } else {
                                                String A072 = r22.A07();
                                                File A0t = AnonymousClass7TE.A0t(r22.A0k);
                                                int i5 = r22.A07;
                                                int i6 = r22.A0K;
                                                int i7 = r22.A08;
                                                int i8 = r22.A09;
                                                String A064 = r22.A06();
                                                ImmutableList of = ImmutableList.of();
                                                0qQ.A07(of);
                                                int i9 = hsQ.A01;
                                                int i10 = hsQ.A00;
                                                Integer num = AnonymousClass05K.A01;
                                                boolean z = r22.A1L;
                                                String str = r22.A0r;
                                                MediaUploadMetadata A022 = r22.A02();
                                                List list3 = r22.A0w;
                                                int i11 = r22.A0F;
                                                int i12 = 54;
                                                if (i11 != 54) {
                                                    i12 = 1;
                                                }
                                                C353498Hw r20 = r0;
                                                C353498Hw.A0I(of, (ImmutableList) null, A022, r20, A0t, Boolean.valueOf(listIterator.hasNext()), num, Integer.valueOf(i12), A072, A064, str, list3, i5, i6, i7, i8, i9, i10, true, z);
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        onFail(A15);
    }
}
