package X;

import android.widget.TextView;
import com.instagram.api.schemas.TrackData;
import com.instagram.reels.question.model.MusicQuestionResponseModel;

/* renamed from: X.VFx  reason: case insensitive filesystem */
public abstract class C17049VFx {
    public static void A00(C17801VgE vgE, C20961X6o x6o, C14883UDl uDl, Integer num, int i) {
        C17047VFv.A00(vgE, x6o, uDl.A04, num, i);
        MusicQuestionResponseModel musicQuestionResponseModel = vgE.A00.A01;
        if (musicQuestionResponseModel != null) {
            TrackData trackData = musicQuestionResponseModel.A00;
            TextView textView = uDl.A02;
            textView.getClass();
            textView.setText(trackData.getDisplayArtist());
            TextView textView2 = uDl.A03;
            textView2.getClass();
            textView2.setText(trackData.getTitle());
            JYP.A00(uDl.A01, trackData.Arr());
        }
    }
}
