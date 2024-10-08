package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.rsys.log.gen.CallSummaryInfo;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3he  reason: invalid class name and case insensitive filesystem */
public final class C248243he extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248243he(2Lk r7) {
        super("igLogPersistence", 168, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        File[] listFiles;
        String str;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        AnonymousClass95V r5 = new AnonymousClass95V(r1.A04);
        Context context = r1.A01;
        0qQ.A0B(context, 0);
        long j = C638918c.A00(context).getLong("last_app_start_timestamp", -1);
        long currentTimeMillis = System.currentTimeMillis();
        0t0 A01 = AnonymousClass0eN.A01(new C377209Ky(r5, 9));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        0qQ.A07(defaultSharedPreferences);
        0tX r4 = new 0tX(defaultSharedPreferences, "IgLogPersistenceAppJob");
        String string = r4.getString(C66579MXk.A00(1080), "");
        long j2 = r4.getLong(C66579MXk.A00(1081), -1);
        AnonymousClass95Y r6 = (AnonymousClass95Y) A01.getValue();
        0qQ.A0B(r6, 4);
        if (AnonymousClass95W.A00 != null) {
            long j3 = currentTimeMillis - 172800000;
            File file = AnonymousClass95X.A00;
            if (file != null && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.lastModified() <= j) {
                        try {
                            if (file2.lastModified() > j3) {
                                String A002 = C272134kB.A00(file2, AnonymousClass15Q.A05);
                                String name = file2.getName();
                                0qQ.A07(name);
                                if (0qQ.A0K(00l.A0L(name, ".", name), Pxd.A00(194))) {
                                    CallSummaryInfo callSummaryInfo = new CallSummaryInfo(C21513Xdf.A00(A002));
                                    CallSummaryInfo.Builder A003 = C21513Xdf.A00(A002);
                                    Long l = callSummaryInfo.batteryEndLevel;
                                    0Pd r0 = 0Pd.A0A;
                                    if (r0 != null) {
                                        str = 0MH.A01(r0, l);
                                    } else {
                                        str = "not_init";
                                    }
                                    A003.coldStartReason = str;
                                    String str2 = callSummaryInfo.localCallId;
                                    0qQ.A06(str2);
                                    long j4 = j2;
                                    if (!0qQ.A0K(string, str2)) {
                                        j4 = -1;
                                    }
                                    A003.deviceShutdownTime = Long.valueOf(j4);
                                    CallSummaryInfo callSummaryInfo2 = new CallSummaryInfo(A003);
                                    0wc r2 = r6.A00;
                                    0Aj A004 = r2.A00(r2.A00, "ls_rtc_call_summary");
                                    if (A004.isSampled()) {
                                        A004.AAJ(AnonymousClass000.A00(5011), callSummaryInfo2.localCallId);
                                        A004.A9F("system_time", Long.valueOf(callSummaryInfo2.systemTime));
                                        A004.A9F("steady_time", Long.valueOf(callSummaryInfo2.steadyTime));
                                        A004.A9F("call_created_time", Long.valueOf(callSummaryInfo2.callCreatedTime));
                                        A004.A9F("call_answered_time", Long.valueOf(callSummaryInfo2.callAnsweredTime));
                                        A004.A9F("call_connected_time", Long.valueOf(callSummaryInfo2.callConnectedTime));
                                        A004.A9F("call_ended_time", Long.valueOf(callSummaryInfo2.callEndedTime));
                                        A004.A9F(AnonymousClass000.A00(4994), Long.valueOf(callSummaryInfo2.lastUpdatedTime));
                                        A004.AAJ("call_trigger", callSummaryInfo2.callTrigger);
                                        A004.A7p("is_caller", Boolean.valueOf(callSummaryInfo2.isCaller));
                                        String str3 = callSummaryInfo2.sharedCallId;
                                        if (str3 != null) {
                                            A004.AAJ(AnonymousClass000.A00(5227), str3);
                                        }
                                        Long l2 = callSummaryInfo2.engineCreatedTime;
                                        if (l2 != null) {
                                            A004.A9F("engine_created_time", l2);
                                        }
                                        Long l3 = callSummaryInfo2.joinableCompleteTime;
                                        if (l3 != null) {
                                            A004.A9F("joinable_complete_time", l3);
                                        }
                                        String str4 = callSummaryInfo2.peerId;
                                        if (str4 != null) {
                                            A004.AAJ("peer_id", str4);
                                        }
                                        String str5 = callSummaryInfo2.endCallReason;
                                        if (str5 != null) {
                                            A004.AAJ("end_call_reason", str5);
                                        }
                                        Boolean bool = callSummaryInfo2.remoteEnded;
                                        if (bool != null) {
                                            A004.A7p(AnonymousClass000.A00(3878), bool);
                                        }
                                        Boolean bool2 = callSummaryInfo2.inviteRequestedVideo;
                                        if (bool2 != null) {
                                            A004.A7p("invite_requested_video", bool2);
                                        }
                                        Long l4 = callSummaryInfo2.mediaGateBlockedFrameCount;
                                        if (l4 != null) {
                                            A004.A9F("media_gate_blocked_frame_count", l4);
                                        }
                                        String str6 = callSummaryInfo2.videoEscalationStatus;
                                        if (str6 != null) {
                                            A004.AAJ("video_escalation_status", str6);
                                        }
                                        Long l5 = callSummaryInfo2.localVideoDuration;
                                        if (l5 != null) {
                                            A004.A9F("local_video_duration", l5);
                                        }
                                        Long l6 = callSummaryInfo2.remoteVideoDuration;
                                        if (l6 != null) {
                                            A004.A9F("remote_video_duration", l6);
                                        }
                                        Long l7 = callSummaryInfo2.batteryStartLevel;
                                        if (l7 != null) {
                                            A004.A9F("battery_start_level", l7);
                                        }
                                        Long l8 = callSummaryInfo2.batteryEndLevel;
                                        if (l8 != null) {
                                            A004.A9F("battery_end_level", l8);
                                        }
                                        Boolean bool3 = callSummaryInfo2.wasDeviceCharged;
                                        if (bool3 != null) {
                                            A004.A7p("was_device_charged", bool3);
                                        }
                                        String str7 = callSummaryInfo2.joiningContext;
                                        if (str7 != null) {
                                            A004.AAJ(AnonymousClass000.A00(3479), str7);
                                        }
                                        String str8 = callSummaryInfo2.webDeviceId;
                                        if (str8 != null) {
                                            A004.AAJ(AnonymousClass000.A00(4218), str8);
                                        }
                                        String str9 = callSummaryInfo2.endCallSubreason;
                                        if (str9 != null) {
                                            A004.AAJ("end_call_subreason", str9);
                                        }
                                        String str10 = callSummaryInfo2.coldStartReason;
                                        if (str10 != null) {
                                            A004.AAJ("cold_start_reason", str10);
                                        }
                                        Boolean bool4 = callSummaryInfo2.isConnectedEnd;
                                        if (bool4 != null) {
                                            A004.A7p("is_connected_end", bool4);
                                        }
                                        Long l9 = callSummaryInfo2.deviceShutdownTime;
                                        if (l9 != null) {
                                            A004.A9F("device_shutdown_time", l9);
                                        }
                                        Long l10 = callSummaryInfo2.maxConcurrentConnectedParticipant;
                                        if (l10 != null) {
                                            A004.A9F("max_concurrent_connected_participant", l10);
                                        }
                                        Long l11 = callSummaryInfo2.rtcActorId;
                                        if (l11 != null) {
                                            A004.A9F("rtc_actor_id", l11);
                                        }
                                        Long l12 = callSummaryInfo2.autoRejoinCount;
                                        if (l12 != null) {
                                            A004.A9F("auto_rejoin_count", l12);
                                        }
                                        String str11 = callSummaryInfo2.joinMode;
                                        if (str11 != null) {
                                            A004.AAJ("join_mode", str11);
                                        }
                                        Long l13 = callSummaryInfo2.autoRejoinSuccessfulCount;
                                        if (l13 != null) {
                                            A004.A9F("auto_rejoin_successful_count", l13);
                                        }
                                        String str12 = callSummaryInfo2.webrtcVersion;
                                        if (str12 != null) {
                                            A004.AAJ("webrtc_version", str12);
                                        }
                                        A004.Cgf();
                                    }
                                } else {
                                    throw new IllegalArgumentException(AnonymousClass000.A00(2332));
                                }
                            }
                        } catch (IOException e) {
                            0KC.A0L("AppLogPersistenceAppJobBase", "Unable to upload crashed call summary:\n%s\ncannot be parsed", e, new Object[]{file2});
                        } catch (Exception e2) {
                            0KC.A0G("AppLogPersistenceAppJobBase", "Unable to upload crashed call summary", e2);
                        } catch (Throwable th) {
                            file2.delete();
                            throw th;
                        }
                        file2.delete();
                    }
                }
            }
        }
    }
}
