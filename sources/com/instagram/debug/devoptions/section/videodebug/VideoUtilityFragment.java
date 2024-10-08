package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.0tS;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass3WR;
import X.AnonymousClass4DH;
import X.AnonymousClass4M0;
import X.AnonymousClass4M1;
import X.AnonymousClass4M3;
import X.AnonymousClass4M7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C17130VJf;
import X.C17163VKp;
import X.C227642jf;
import X.C232732uM;
import X.C263414Lx;
import X.C263754Nf;
import X.C263794Nj;
import X.VKr;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class VideoUtilityFragment extends AnonymousClass4DH implements C232732uM {
    public static final Companion Companion = new Object();
    public CheckBox audioEnable;
    public TextView currentPosition;
    public int currentProdTotal;
    public long currentSnaplTotal;
    public TextView currentStatus;
    public TextView currentVolume;
    public SeekBar debugSeekBar;
    public AnonymousClass4M3 igVideoPlayer;
    public CheckBox isLooping;
    public boolean isPaused;
    public TextView loopCount;
    public final Handler mainHandler = AnonymousClass7TF.A0D();
    public Button minusHalfMin;
    public Button minusOneMin;
    public Button plusHalfMin;
    public Button plusOneMin;
    public TextView prodLastPausePosition;
    public TextView prodTimeSpent;
    public TextView prodTimeSpentSoundOn;
    public TextView prodTimeSpentTotal;
    public Button restoreVideo;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public TextView snaplLastPausePosition;
    public TextView snaplTimeSpent;
    public TextView snaplTimeSpentSoundOn;
    public TextView snaplTimeSpentTotal;
    public SimpleVideoLayout videoContainer;

    public final class Companion {
        public final VideoUtilityFragment newInstance(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
            VideoUtilityFragment videoUtilityFragment = new VideoUtilityFragment();
            videoUtilityFragment.setArguments(bundle);
            return videoUtilityFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final VideoUtilityFragment newInstance(String str) {
        return Companion.newInstance(str);
    }

    public String getModuleName() {
        return "video_utility";
    }

    public void onCompletion() {
    }

    public void onCues(List list) {
    }

    public void onDrawnToSurface() {
    }

    public void onPrepare(C263754Nf r1) {
    }

    public void onProgressStateChanged(boolean z) {
    }

    public void onSeeking(long j) {
    }

    public void onStopVideo(String str, boolean z) {
    }

    public void onStopped(C263754Nf r1, int i) {
    }

    public void onSurfaceTextureDestroyed() {
    }

    public void onSurfaceTextureUpdated(C263754Nf r1) {
    }

    public void onVideoDownloading(C263754Nf r1) {
    }

    public void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public void onVideoPlayerPaused() {
    }

    public void onVideoPrepared(C263754Nf r3, boolean z) {
        String str;
        0qQ.A0B(r3, 0);
        CheckBox checkBox = this.audioEnable;
        if (checkBox == null) {
            str = "audioEnable";
        } else {
            checkBox.setChecked(r3.A00);
            SeekBar seekBar = this.debugSeekBar;
            if (seekBar == null) {
                str = "debugSeekBar";
            } else {
                AnonymousClass4M3 r0 = this.igVideoPlayer;
                if (r0 == null) {
                    str = "igVideoPlayer";
                } else {
                    seekBar.setMax(r0.AzN());
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void onVideoSizeChanged(int i, int i2, float f) {
    }

    public void onVideoStartedPlaying(C263754Nf r1) {
    }

    public void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public void onVideoViewPrepared(C263754Nf r1) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        TextView textView = this.prodTimeSpent;
        if (textView == null) {
            str = "prodTimeSpent";
        } else {
            textView.setText("0");
            TextView textView2 = this.prodTimeSpentTotal;
            if (textView2 == null) {
                str = "prodTimeSpentTotal";
            } else {
                textView2.setText("0");
                TextView textView3 = this.prodLastPausePosition;
                if (textView3 == null) {
                    str = "prodLastPausePosition";
                } else {
                    textView3.setText("0");
                    TextView textView4 = this.prodTimeSpentSoundOn;
                    if (textView4 == null) {
                        str = "prodTimeSpentSoundOn";
                    } else {
                        textView4.setText("0");
                        TextView textView5 = this.snaplTimeSpent;
                        if (textView5 == null) {
                            str = "snaplTimeSpent";
                        } else {
                            textView5.setText("0");
                            TextView textView6 = this.snaplTimeSpentTotal;
                            if (textView6 == null) {
                                str = "snaplTimeSpentTotal";
                            } else {
                                textView6.setText("0");
                                TextView textView7 = this.snaplLastPausePosition;
                                if (textView7 == null) {
                                    str = "snaplLastPausePosition";
                                } else {
                                    textView7.setText("0");
                                    TextView textView8 = this.snaplTimeSpentSoundOn;
                                    if (textView8 == null) {
                                        str = "snaplTimeSpentSoundOn";
                                    } else {
                                        textView8.setText("0");
                                        super.onViewCreated(view, bundle);
                                        AnonymousClass0fU.A00(new VideoUtilityFragment$onViewCreated$1(this), view);
                                        CheckBox checkBox = this.isLooping;
                                        if (checkBox == null) {
                                            str = "isLooping";
                                        } else {
                                            checkBox.setOnCheckedChangeListener(new VideoUtilityFragment$onViewCreated$2(this));
                                            setAudioVolume();
                                            Button button = this.plusOneMin;
                                            if (button == null) {
                                                str = "plusOneMin";
                                            } else {
                                                AnonymousClass0fU.A00(new VideoUtilityFragment$onViewCreated$3(this), button);
                                                Button button2 = this.minusOneMin;
                                                if (button2 == null) {
                                                    str = "minusOneMin";
                                                } else {
                                                    AnonymousClass0fU.A00(new VideoUtilityFragment$onViewCreated$4(this), button2);
                                                    Button button3 = this.plusHalfMin;
                                                    if (button3 == null) {
                                                        str = "plusHalfMin";
                                                    } else {
                                                        AnonymousClass0fU.A00(new VideoUtilityFragment$onViewCreated$5(this), button3);
                                                        Button button4 = this.minusHalfMin;
                                                        if (button4 == null) {
                                                            str = "minusHalfMin";
                                                        } else {
                                                            AnonymousClass0fU.A00(new VideoUtilityFragment$onViewCreated$6(this), button4);
                                                            SeekBar seekBar = this.debugSeekBar;
                                                            if (seekBar == null) {
                                                                str = "debugSeekBar";
                                                            } else {
                                                                seekBar.setOnSeekBarChangeListener(new VideoUtilityFragment$onViewCreated$7(this));
                                                                Button button5 = this.restoreVideo;
                                                                if (button5 == null) {
                                                                    str = "restoreVideo";
                                                                } else {
                                                                    AnonymousClass0fU.A00(new VideoUtilityFragment$onViewCreated$8(this), button5);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    private final void setAudioVolume() {
        CheckBox checkBox = this.audioEnable;
        if (checkBox == null) {
            0qQ.A0F("audioEnable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            checkBox.setOnCheckedChangeListener(new VideoUtilityFragment$setAudioVolume$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void togglePause(boolean z) {
        String str = "igVideoPlayer";
        if (z) {
            this.isPaused = false;
            TextView textView = this.loopCount;
            if (textView == null) {
                str = "loopCount";
            } else {
                textView.setText("0");
                AnonymousClass4M3 r0 = this.igVideoPlayer;
                if (r0 != null) {
                    r0.E2q("tapped", false);
                    return;
                }
            }
        } else {
            this.isPaused = true;
            AnonymousClass4M3 r02 = this.igVideoPlayer;
            if (r02 != null) {
                r02.E21("tapped");
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void onLoop(int i) {
        TextView textView = this.loopCount;
        if (textView == null) {
            0qQ.A0F("loopCount");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C13988Tno.A15(textView, i);
        }
    }

    public void onProgressUpdate(int i, int i2, boolean z) {
        String str;
        TextView textView = this.currentPosition;
        if (textView == null) {
            str = "currentPosition";
        } else {
            C13988Tno.A15(textView, i);
            SeekBar seekBar = this.debugSeekBar;
            if (seekBar == null) {
                str = "debugSeekBar";
            } else {
                seekBar.setProgress(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void onSnaplTimeChanged(long j, long j2, long j3) {
        FragmentActivity activity;
        if (this.isPaused && (activity = getActivity()) != null) {
            activity.runOnUiThread(new VideoUtilityFragment$onSnaplTimeChanged$1(this, j, j2, j3));
        }
    }

    public void onTimeChanged(int i, int i2, int i3) {
        FragmentActivity activity;
        if (this.isPaused && (activity = getActivity()) != null) {
            activity.runOnUiThread(new VideoUtilityFragment$onTimeChanged$1(this, i, i2, i3));
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(684469738);
        VideoUtilityFragment.super.onCreate(bundle);
        0tS A00 = 0tS.A4E.A00();
        AnonymousClass7TF.A1J(A00, A00.A18, 0tS.A4G, 4, true);
        VKr.A04.add(this);
        C17130VJf.A00.add(this);
        AnonymousClass0fD.A09(986498745, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1028004669);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.video_utility_layout, viewGroup, false);
        this.videoContainer = (SimpleVideoLayout) inflate.findViewById(R.id.video_container);
        this.prodTimeSpent = AnonymousClass7TE.A0d(inflate, R.id.prod_time_spent);
        this.prodTimeSpentTotal = AnonymousClass7TE.A0d(inflate, R.id.prod_time_spent_total);
        this.snaplTimeSpent = AnonymousClass7TE.A0d(inflate, R.id.snapl_time_spent);
        this.snaplTimeSpentTotal = AnonymousClass7TE.A0d(inflate, R.id.snapl_time_spent_total);
        this.isLooping = (CheckBox) inflate.findViewById(R.id.set_loop_button);
        this.audioEnable = (CheckBox) inflate.findViewById(R.id.set_audio_button);
        this.currentPosition = AnonymousClass7TE.A0d(inflate, R.id.current_position);
        this.loopCount = AnonymousClass7TE.A0d(inflate, R.id.loop_count);
        this.currentStatus = AnonymousClass7TE.A0d(inflate, R.id.current_status);
        this.prodLastPausePosition = AnonymousClass7TE.A0d(inflate, R.id.prod_last_pause_position);
        this.snaplLastPausePosition = AnonymousClass7TE.A0d(inflate, R.id.snapl_last_pause_position);
        this.currentVolume = AnonymousClass7TE.A0d(inflate, R.id.current_volume);
        this.debugSeekBar = (SeekBar) inflate.findViewById(R.id.video_seekbar);
        this.prodTimeSpentSoundOn = AnonymousClass7TE.A0d(inflate, R.id.prod_time_spent_sound_on);
        this.snaplTimeSpentSoundOn = AnonymousClass7TE.A0d(inflate, R.id.snapl_time_spent_sound_on);
        this.plusOneMin = (Button) inflate.findViewById(R.id.plus_one_min);
        this.minusOneMin = (Button) inflate.findViewById(R.id.minus_one_min);
        this.plusHalfMin = (Button) inflate.findViewById(R.id.plus_half_min);
        this.minusHalfMin = (Button) inflate.findViewById(R.id.minus_half_min);
        this.restoreVideo = (Button) inflate.findViewById(R.id.restore);
        AnonymousClass0fD.A09(-1936765210, A02);
        return inflate;
    }

    public void onDestroy() {
        int A02 = AnonymousClass0fD.A02(1697556586);
        super.onDestroy();
        0tS A00 = 0tS.A4E.A00();
        AnonymousClass7TF.A1J(A00, A00.A18, 0tS.A4G, 4, false);
        VKr.A04.remove(this);
        C17130VJf.A00.remove(this);
        AnonymousClass0fD.A09(491204848, A02);
    }

    public void onPause() {
        int A02 = AnonymousClass0fD.A02(-1266972264);
        VideoUtilityFragment.super.onPause();
        AnonymousClass4M3 r2 = this.igVideoPlayer;
        if (r2 == null) {
            0qQ.A0F("igVideoPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.ECP("fragment_paused");
        this.mainHandler.removeCallbacksAndMessages((Object) null);
        AnonymousClass0fD.A09(17682018, A02);
    }

    public void onResume() {
        int A02 = AnonymousClass0fD.A02(-335831710);
        super.onResume();
        Context context = getContext();
        if (context != null) {
            AnonymousClass4M1 A00 = AnonymousClass4M0.A00(context, AnonymousClass7TE.A0l(this.session$delegate), C17163VKp.A01, this, "video_utility");
            this.igVideoPlayer = A00;
            String str = "igVideoPlayer";
            A00.EjF(AnonymousClass4M7.FIT);
            AnonymousClass4M3 r1 = this.igVideoPlayer;
            if (r1 != null) {
                ((AnonymousClass4M1) r1).A0X = true;
                AnonymousClass3WR r6 = C17163VKp.A02;
                SimpleVideoLayout simpleVideoLayout = this.videoContainer;
                if (simpleVideoLayout == null) {
                    str = "videoContainer";
                } else {
                    r1.E4H(new C263794Nj(simpleVideoLayout, new C263414Lx(false, false, false, false), r6, C17163VKp.A03, (String) null, "video_utility", C17163VKp.A00, -1, 0, true));
                    this.mainHandler.post(new VideoUtilityFragment$onResume$1(this));
                    AnonymousClass0fD.A09(-1052382620, A02);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-979551252, A02);
        throw A0y;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
