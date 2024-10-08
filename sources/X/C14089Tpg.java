package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Tpg  reason: case insensitive filesystem */
public final class C14089Tpg implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C14089Tpg(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A04 = z;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.A00 != 0) {
            0qQ.A0B(seekBar, 0);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
            if (z) {
                ViewGroup A012 = C3019160o.A01(seekBar);
                AnonymousClass7TG.A0R(A012, R.id.progress_time).setText(1G0.A02((long) i));
                return;
            }
            return;
        }
        0qQ.A0B(seekBar, 0);
        C276544tV r3 = (C276544tV) this.A02;
        float f = 100.0f;
        if (r3.A02(46, 0.0f) > 0.0f) {
            f = 1.0f / r3.A02(46, 0.0f);
        }
        float f2 = ((float) i) / f;
        C307786Rm r5 = (C307786Rm) this.A01;
        C55583Hk3 hk3 = (C55583Hk3) C307476Qg.A06(r5, r3);
        if (hk3 != null) {
            hk3.A00 = Float.valueOf(f2);
        }
        C277014uI A0A = r3.A0A(48);
        if (A0A != null) {
            AnonymousClass6Tm r1 = AnonymousClass6Tm.A01;
            List list = r3.A09;
            Object A002 = C299275ur.A00(C307896Rx.A01(r5, A0A, list), r1, A0A);
            0qQ.A0C(A002, Pxd.A00(2));
            Map map = (Map) A002;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                Object next = A16.next();
                Object obj = map.get(next);
                if (obj != null) {
                    C277014uI r10 = ((C280064zw) obj).A00;
                    C308276Tl r12 = new C308276Tl();
                    r12.A03(Float.valueOf(f2), 0);
                    r12.A02(r5);
                    Object A003 = C299275ur.A00(C307896Rx.A01(r5, r10, list), r12.A00(), r10);
                    0qQ.A0C(A003, "null cannot be cast to non-null type kotlin.Number");
                    linkedHashMap.put(next, Float.valueOf(((Number) A003).floatValue()));
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            VQM vqm = VQM.A01;
            if (vqm == null) {
                vqm = new VQM();
                VQM.A01 = vqm;
            }
            Iterator it = vqm.A00.iterator();
            while (it.hasNext()) {
                FoaLiveEditingProvider foaLiveEditingProvider = ((CommonSparkAvatarPreviewController) it.next()).A00;
                if (foaLiveEditingProvider != null) {
                    C18741VzM vzM = foaLiveEditingProvider.A02;
                    if (vzM == null) {
                        0qQ.A0F("commonLiveEditingProvider");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C18081VlB vlB = vzM.A0B;
                    String obj2 = C16772V5f.A00().toString();
                    0qQ.A07(obj2);
                    vlB.A08(obj2, linkedHashMap);
                }
            }
        }
        C277014uI A08 = r3.A08();
        if (A08 != null) {
            C308276Tl r13 = new C308276Tl();
            r13.A03(Float.valueOf(f2), 0);
            r13.A02(r5);
            DbT.A1R(r5, r3, r13, A08);
        }
        if (this.A04) {
            H5B.A00(seekBar);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.A00 != 0) {
            0qQ.A0B(seekBar, 0);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
            Context context = seekBar.getContext();
            Drawable drawable = context.getResources().getDrawable(R.drawable.clips_attached_scrubber_progress_active_drawable);
            AbsSeekBar absSeekBar = (AbsSeekBar) this.A02;
            absSeekBar.setProgressDrawable(drawable);
            if (((C52222GJn) this.A03).A0A) {
                absSeekBar.setThumb(context.getDrawable(R.drawable.clips_scrubber_thumb_active_drawable));
            }
            if (this.A04) {
                Dbb.A0t(C3019160o.A01(seekBar), R.id.timestamps_container, 0);
                return;
            }
            return;
        }
        C276544tV r3 = (C276544tV) this.A02;
        C277014uI A0A = r3.A0A(40);
        C307786Rm r1 = (C307786Rm) this.A01;
        if (A0A != null) {
            C307886Rw.A03(r1, r3, Pxj.A0a(r1), A0A);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.A00 != 0) {
            0qQ.A0B(seekBar, 0);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
            Drawable drawable = DbU.A05(seekBar).getDrawable(R.drawable.clips_attached_scrubber_progress_inactive_drawable);
            if (((C52222GJn) this.A03).A0A && !(seekBar.getThumb() instanceof ColorDrawable)) {
                seekBar.setThumb(new ColorDrawable(0));
            }
            ((ProgressBar) this.A02).setProgressDrawable(drawable);
            JTS.A0y(C3019160o.A01(seekBar), R.id.timestamps_container);
            return;
        }
        C276544tV r5 = (C276544tV) this.A02;
        AnonymousClass7TF.A0D().postDelayed(new C20316WpB((H5B) this.A03, (C307786Rm) this.A01, r5, r5.A0A(38)), 200);
    }
}
