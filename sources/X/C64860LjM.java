package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LjM  reason: case insensitive filesystem */
public final class C64860LjM implements C240963Ni {
    public final int A00;
    public final Object A01;

    public C64860LjM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DEN() {
        BitmapDrawable bitmapDrawable;
        switch (this.A00) {
            case 0:
                ((C241063Ns) this.A01).A0U(new Exception("Failed to load center image"));
                return;
            case 3:
                0kD.A09("post_live_igtv_cover_picker", "Failed to load cover photo", (Throwable) null);
                return;
            case 4:
                ImageView imageView = (ImageView) this.A01;
                Drawable drawable = imageView.getContext().getDrawable(R.drawable.default_album_art_icon);
                Bitmap bitmap = null;
                if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                    bitmap = bitmapDrawable.getBitmap();
                }
                imageView.setImageBitmap(bitmap);
                return;
            default:
                return;
        }
    }

    public final void DO4(C240983Nk r11) {
        String str;
        Context context;
        switch (this.A00) {
            case 0:
                ((C241063Ns) this.A01).A0T(C60340gF.A00);
                return;
            case 1:
                C61437K7m k7m = (C61437K7m) this.A01;
                int i = k7m.A00 + 1;
                k7m.A00 = i;
                if (i == 5) {
                    SpinnerImageView spinnerImageView = k7m.A0F;
                    if (spinnerImageView == null) {
                        str = "spinner";
                        break;
                    } else {
                        spinnerImageView.setVisibility(8);
                        ConstraintLayout constraintLayout = k7m.A06;
                        if (constraintLayout == null) {
                            str = "constraintLayout";
                            break;
                        } else {
                            constraintLayout.setVisibility(0);
                            AnimatorSet animatorSet = new AnimatorSet();
                            List<Object> list = k7m.A0G;
                            if (list == null) {
                                str = "stickerList";
                                break;
                            } else {
                                ArrayList A0r = AnonymousClass7TG.A0r(list);
                                for (Object ofPropertyValuesHolder : list) {
                                    A0r.add(ObjectAnimator.ofPropertyValuesHolder(ofPropertyValuesHolder, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f})}));
                                }
                                animatorSet.playTogether(A0r);
                                animatorSet.setInterpolator(new DecelerateInterpolator());
                                animatorSet.setDuration(280);
                                animatorSet.setStartDelay(500);
                                animatorSet.start();
                                ConstraintLayout constraintLayout2 = k7m.A07;
                                if (constraintLayout2 == null) {
                                    str = "stickerLayout";
                                    break;
                                } else {
                                    ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(constraintLayout2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.0f})});
                                    0qQ.A07(ofPropertyValuesHolder2);
                                    ofPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
                                    ofPropertyValuesHolder2.setDuration(350);
                                    ofPropertyValuesHolder2.setStartDelay(3780);
                                    ofPropertyValuesHolder2.start();
                                    IgImageView igImageView = k7m.A0D;
                                    if (igImageView == null) {
                                        str = "exitNuxSticker";
                                        break;
                                    } else {
                                        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(igImageView, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{0.0f, 1.0f})});
                                        0qQ.A07(ofPropertyValuesHolder3);
                                        ofPropertyValuesHolder3.setInterpolator(new AccelerateDecelerateInterpolator());
                                        ofPropertyValuesHolder3.setDuration(280);
                                        ofPropertyValuesHolder3.setStartDelay(4100);
                                        ofPropertyValuesHolder3.start();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            case 2:
                0qQ.A0B(r11, 0);
                Bitmap bitmap = r11.A02;
                if (bitmap != null) {
                    K8A k8a = ((KFW) this.A01).A01.A00;
                    if (k8a instanceof C61942KSr) {
                        C61942KSr kSr = (C61942KSr) k8a;
                        if (JTT.A1a(kSr) && (context = kSr.getContext()) != null) {
                            C65413Lst.A00.A00(context, bitmap, AnonymousClass7TE.A0l(kSr.A0W), JTO.A0k(kSr.A0Y));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                0qQ.A0B(r11, 0);
                Bitmap bitmap2 = r11.A02;
                if (bitmap2 != null) {
                    C61939KSo kSo = (C61939KSo) this.A01;
                    C59986Jcv jcv = kSo.A07;
                    if (jcv == null) {
                        str = "thumb";
                        break;
                    } else {
                        jcv.A07 = bitmap2;
                        jcv.invalidateSelf();
                        kSo.A00 = bitmap2;
                        if (kSo.A04) {
                            C65413Lst.A00.A00(kSo.requireContext(), bitmap2, AnonymousClass7TE.A0l(kSo.A0C), JTO.A0k(kSo.A0D));
                            return;
                        }
                        return;
                    }
                } else {
                    0kD.A09("post_live_igtv_cover_picker", "Failed to load bit map of cover photo", (Throwable) null);
                    return;
                }
            default:
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
