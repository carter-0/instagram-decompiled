package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass3WR;
import X.AnonymousClass4M3;
import X.C17163VKp;
import X.C263414Lx;
import X.C263794Nj;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

public final class VideoUtilityFragment$onViewCreated$8 implements View.OnClickListener {
    public final /* synthetic */ VideoUtilityFragment this$0;

    public VideoUtilityFragment$onViewCreated$8(VideoUtilityFragment videoUtilityFragment) {
        this.this$0 = videoUtilityFragment;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1800012896);
        VideoUtilityFragment videoUtilityFragment = this.this$0;
        videoUtilityFragment.currentProdTotal = 0;
        videoUtilityFragment.currentSnaplTotal = 0;
        TextView textView = videoUtilityFragment.prodTimeSpent;
        if (textView == null) {
            str = "prodTimeSpent";
        } else {
            textView.setText("0");
            TextView textView2 = this.this$0.prodTimeSpentTotal;
            if (textView2 == null) {
                str = "prodTimeSpentTotal";
            } else {
                textView2.setText("0");
                TextView textView3 = this.this$0.prodLastPausePosition;
                if (textView3 == null) {
                    str = "prodLastPausePosition";
                } else {
                    textView3.setText("0");
                    TextView textView4 = this.this$0.prodTimeSpentSoundOn;
                    if (textView4 == null) {
                        str = "prodTimeSpentSoundOn";
                    } else {
                        textView4.setText("0");
                        TextView textView5 = this.this$0.snaplTimeSpent;
                        if (textView5 == null) {
                            str = "snaplTimeSpent";
                        } else {
                            textView5.setText("0");
                            TextView textView6 = this.this$0.snaplTimeSpentTotal;
                            if (textView6 == null) {
                                str = "snaplTimeSpentTotal";
                            } else {
                                textView6.setText("0");
                                TextView textView7 = this.this$0.snaplLastPausePosition;
                                if (textView7 == null) {
                                    str = "snaplLastPausePosition";
                                } else {
                                    textView7.setText("0");
                                    TextView textView8 = this.this$0.snaplTimeSpentSoundOn;
                                    if (textView8 == null) {
                                        str = "snaplTimeSpentSoundOn";
                                    } else {
                                        textView8.setText("0");
                                        TextView textView9 = this.this$0.loopCount;
                                        if (textView9 == null) {
                                            str = "loopCount";
                                        } else {
                                            textView9.setText("0");
                                            VideoUtilityFragment videoUtilityFragment2 = this.this$0;
                                            videoUtilityFragment2.isPaused = false;
                                            AnonymousClass4M3 r0 = videoUtilityFragment2.igVideoPlayer;
                                            String str2 = "igVideoPlayer";
                                            if (r0 != null) {
                                                AnonymousClass3WR r7 = C17163VKp.A02;
                                                SimpleVideoLayout simpleVideoLayout = videoUtilityFragment2.videoContainer;
                                                if (simpleVideoLayout == null) {
                                                    str2 = "videoContainer";
                                                } else {
                                                    r0.E4H(new C263794Nj(simpleVideoLayout, new C263414Lx(false, false, false, false), r7, C17163VKp.A03, (String) null, "video_utility", C17163VKp.A00, -1, 0, true));
                                                    AnonymousClass4M3 r02 = this.this$0.igVideoPlayer;
                                                    if (r02 != null) {
                                                        r02.Ech(false);
                                                        CheckBox checkBox = this.this$0.isLooping;
                                                        if (checkBox == null) {
                                                            str = "isLooping";
                                                        } else {
                                                            checkBox.setChecked(false);
                                                            AnonymousClass4M3 r2 = this.this$0.igVideoPlayer;
                                                            if (r2 != null) {
                                                                r2.Eqr(0.0f, 1);
                                                                CheckBox checkBox2 = this.this$0.audioEnable;
                                                                if (checkBox2 == null) {
                                                                    str = "audioEnable";
                                                                } else {
                                                                    checkBox2.setChecked(false);
                                                                    AnonymousClass0fD.A0C(-1464457553, A05);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            0qQ.A0F(str2);
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
