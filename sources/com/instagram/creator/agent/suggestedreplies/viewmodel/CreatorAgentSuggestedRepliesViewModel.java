package com.instagram.creator.agent.suggestedreplies.viewmodel;

import X.02z;
import X.05G;
import X.0Aj;
import X.0KC;
import X.0Tu;
import X.0bb;
import X.0qQ;
import X.0s0;
import X.0sn;
import X.0wc;
import X.182;
import X.19B;
import X.1Au;
import X.1Av;
import X.1Eo;
import X.2Er;
import X.AnonymousClass05K;
import X.AnonymousClass0HM;
import X.AnonymousClass0Ud;
import X.AnonymousClass0YZ;
import X.AnonymousClass4D7;
import X.AnonymousClass7GK;
import X.AnonymousClass7GM;
import X.AnonymousClass7L2;
import X.C262204Co;
import X.C318116oQ;
import X.C318136oS;
import X.C331667Rw;
import X.C61074JwC;
import X.C62652KkE;
import X.C62653KkF;
import X.C62665KkR;
import X.LDR;
import X.MFR;
import X.MFh;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.user.model.User;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;

public final class CreatorAgentSuggestedRepliesViewModel extends C331667Rw {
    public final 05G _uiState;
    public AnonymousClass7GK currentComposerState;
    public C262204Co currentJob;
    public boolean isKeyboardShowing;
    public final LDR logger;
    public String otherUserMessagingId;
    public C62665KkR pendingTypeOfCollapse;
    public final CreatorAgentSuggestedRepliesRepository repository;
    public final CreatorAgentSuggestedRepliesSettingsRepository settingsRepository;
    public final AnonymousClass0Ud uiState;
    public final UserSession userSession;

    public CreatorAgentSuggestedRepliesViewModel(UserSession userSession2, LDR ldr, CreatorAgentSuggestedRepliesRepository creatorAgentSuggestedRepliesRepository, CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository) {
        0qQ.A0B(userSession2, 1);
        0qQ.A0B(ldr, 2);
        0qQ.A0B(creatorAgentSuggestedRepliesRepository, 3);
        0qQ.A0B(creatorAgentSuggestedRepliesSettingsRepository, 4);
        this.userSession = userSession2;
        this.logger = ldr;
        this.repository = creatorAgentSuggestedRepliesRepository;
        this.settingsRepository = creatorAgentSuggestedRepliesSettingsRepository;
        02z r0 = new 02z(new C61074JwC((AnonymousClass7L2) null, AnonymousClass05K.A01, AnonymousClass05K.A00, (List) 0sn.A00));
        this._uiState = r0;
        this.uiState = r0;
    }

    private final boolean isEligibleForInThreadOptInExperience(int i) {
        if (i != 1) {
            if (i != 0) {
                return false;
            }
            if (!Boolean.valueOf(182.A06(0Tu.A05, this.userSession, 36321279997453543L)).booleanValue()) {
                return false;
            }
        }
        1Av A00 = 1Au.A00(this.userSession);
        0s0 r1 = A00.A1a;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        if (((Boolean) r1.CDM(A00, r3[387])).booleanValue()) {
            return false;
        }
        1Av A002 = 1Au.A00(this.userSession);
        long longValue = ((Number) A002.A6b.CDM(A002, r3[389])).longValue();
        UserSession userSession2 = this.userSession;
        0Tu r32 = 0Tu.A05;
        return longValue < Long.valueOf(182.A01(r32, userSession2, 36602754974225146L)).longValue() && Boolean.valueOf(182.A06(r32, this.userSession, 36321279997256934L)).booleanValue();
    }

    public final void generateResponses(boolean z) {
        Object value;
        C61074JwC jwC;
        String str;
        String obj;
        String str2;
        String str3 = this.otherUserMessagingId;
        if (str3 != null) {
            05G r5 = this._uiState;
            do {
                value = r5.getValue();
                jwC = (C61074JwC) value;
            } while (!r5.AIY(value, C61074JwC.A01((AnonymousClass7L2) jwC.A03, (Integer) jwC.A00, AnonymousClass05K.A0C, (List) jwC.A02)));
            LDR ldr = this.logger;
            C62652KkE kkE = ldr.A00;
            String str4 = "";
            if (kkE == null) {
                0KC.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
            } else {
                0wc r3 = ldr.A03;
                0Aj A00 = r3.A00(r3.A00, "ig_creator_agents_suggested_replies_request_sr_message");
                if (A00.isSampled()) {
                    String obj2 = AnonymousClass0HM.A00().toString();
                    0qQ.A07(obj2);
                    UUID uuid = ldr.A01;
                    if (uuid == null || (str = uuid.toString()) == null) {
                        str = str4;
                    }
                    A00.AAJ("sr_session_id", str);
                    UUID uuid2 = ldr.A02;
                    if (!(uuid2 == null || (obj = uuid2.toString()) == null)) {
                        str4 = obj;
                    }
                    A00.AAJ("thread_session_id", str4);
                    0bb r2 = new 0bb();
                    r2.A01(C62653KkF.CLIENT, "request_from");
                    A00.AAK(r2, "sr_context");
                    A00.A8M(kkE, "inbox_type");
                    A00.AAJ("sr_request_id", obj2);
                    A00.Cgf();
                    str4 = obj2;
                }
            }
            LDR ldr2 = this.logger;
            UUID uuid3 = ldr2.A02;
            String str5 = null;
            if (uuid3 != null) {
                str2 = uuid3.toString();
            } else {
                str2 = null;
            }
            UUID uuid4 = ldr2.A01;
            if (uuid4 != null) {
                str5 = uuid4.toString();
            }
            SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext = new SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext(ldr2.A00, str2, str5, str4);
            this.currentJob = 1Eo.A04(19B.A00, new MFh(this, suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext, str3, (AnonymousClass4D7) null, 3, z), C318116oQ.A00(this));
        }
    }

    public final void onKeyboardCollapsed() {
        Object value;
        C61074JwC jwC;
        this.isKeyboardShowing = false;
        05G r5 = this._uiState;
        do {
            value = r5.getValue();
            jwC = (C61074JwC) value;
        } while (!r5.AIY(value, C61074JwC.A01((AnonymousClass7L2) jwC.A03, AnonymousClass05K.A01, (Integer) jwC.A01, (List) jwC.A02)));
    }

    public final void onKeyboardExpanded() {
        Object value;
        C61074JwC jwC;
        this.isKeyboardShowing = true;
        if (((C61074JwC) this.uiState.getValue()).A00 == AnonymousClass05K.A0C) {
            LDR ldr = this.logger;
            C62665KkR kkR = this.pendingTypeOfCollapse;
            if (kkR == null) {
                kkR = C62665KkR.TAP_KEYBOARD;
            }
            ldr.A00(kkR);
            this.pendingTypeOfCollapse = null;
        }
        05G r5 = this._uiState;
        do {
            value = r5.getValue();
            jwC = (C61074JwC) value;
        } while (!r5.AIY(value, C61074JwC.A01((AnonymousClass7L2) jwC.A03, AnonymousClass05K.A00, (Integer) jwC.A01, (List) jwC.A02)));
    }

    public final void updateTheme(AnonymousClass7L2 r6) {
        Object value;
        C61074JwC jwC;
        0qQ.A0B(r6, 0);
        05G r4 = this._uiState;
        do {
            value = r4.getValue();
            jwC = (C61074JwC) value;
        } while (!r4.AIY(value, C61074JwC.A01(r6, (Integer) jwC.A00, (Integer) jwC.A01, (List) jwC.A02)));
    }

    public static /* synthetic */ void generateResponses$default(CreatorAgentSuggestedRepliesViewModel creatorAgentSuggestedRepliesViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        creatorAgentSuggestedRepliesViewModel.generateResponses(z);
    }

    private final void hideAndReset() {
        Object value;
        Integer num;
        05G r4 = this._uiState;
        do {
            value = r4.getValue();
            num = AnonymousClass05K.A00;
        } while (!r4.AIY(value, C61074JwC.A01((AnonymousClass7L2) ((C61074JwC) value).A03, num, num, 0sn.A00)));
    }

    public final void cancel() {
        Object value;
        C61074JwC jwC;
        this.logger.A00(C62665KkR.TAP_CANCEL);
        C262204Co r1 = this.currentJob;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        05G r5 = this._uiState;
        do {
            value = r5.getValue();
            jwC = (C61074JwC) value;
        } while (!r5.AIY(value, C61074JwC.A01((AnonymousClass7L2) jwC.A03, AnonymousClass05K.A01, AnonymousClass05K.A00, (List) jwC.A02)));
    }

    public final void checkIfNuxAccepted() {
        updateThread(this.currentComposerState);
    }

    public final SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext getLoggingContext() {
        String str;
        LDR ldr = this.logger;
        UUID uuid = ldr.A02;
        String str2 = null;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        UUID uuid2 = ldr.A01;
        if (uuid2 != null) {
            str2 = uuid2.toString();
        }
        return new SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext(ldr.A00, str, str2, "");
    }

    public final AnonymousClass0Ud getUiState() {
        return this.uiState;
    }

    public final void onContainerExpanded(boolean z) {
        String obj;
        Object value;
        C61074JwC jwC;
        Integer num;
        LDR ldr = this.logger;
        0wc r2 = ldr.A03;
        0Aj A00 = r2.A00(r2.A00, "ig_creator_agents_suggested_replies_open");
        C62652KkE kkE = ldr.A00;
        if (kkE == null) {
            0KC.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else if (A00.isSampled()) {
            A00.A8M(kkE, "inbox_type");
            UUID uuid = ldr.A01;
            String str = null;
            if (uuid != null) {
                str = uuid.toString();
            }
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            A00.AAJ("sr_session_id", str);
            UUID uuid2 = ldr.A02;
            if (!(uuid2 == null || (obj = uuid2.toString()) == null)) {
                str2 = obj;
            }
            A00.AAJ("thread_session_id", str2);
            0bb r22 = new 0bb();
            r22.A03("is_sr_auto_shown", Boolean.valueOf(z));
            A00.AAK(r22, "sr_context");
            A00.Cgf();
        }
        05G r6 = this._uiState;
        do {
            value = r6.getValue();
            jwC = (C61074JwC) value;
            if (this.isKeyboardShowing) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0C;
            }
        } while (!r6.AIY(value, C61074JwC.A01((AnonymousClass7L2) jwC.A03, num, (Integer) jwC.A01, (List) jwC.A02)));
        if (((C61074JwC) this.uiState.getValue()).A01 != AnonymousClass05K.A0C && ((List) ((C61074JwC) this.uiState.getValue()).A02).isEmpty()) {
            generateResponses(false);
        }
    }

    public final void onEditTapped() {
        String obj;
        LDR ldr = this.logger;
        C62652KkE kkE = ldr.A00;
        if (kkE == null) {
            0KC.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else {
            0wc r2 = ldr.A03;
            0Aj A00 = r2.A00(r2.A00, "ig_creator_agents_suggested_replies_tap_edit");
            if (A00.isSampled()) {
                A00.A8M(kkE, "inbox_type");
                UUID uuid = ldr.A01;
                String str = null;
                if (uuid != null) {
                    str = uuid.toString();
                }
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                A00.AAJ("sr_session_id", str);
                UUID uuid2 = ldr.A02;
                if (!(uuid2 == null || (obj = uuid2.toString()) == null)) {
                    str2 = obj;
                }
                A00.AAJ("thread_session_id", str2);
                A00.Cgf();
            }
        }
        this.pendingTypeOfCollapse = C62665KkR.TAP_EDIT;
    }

    public final void onNonNetworkError() {
        this.pendingTypeOfCollapse = C62665KkR.AUTO_DISMISS_NO_REPLIES;
    }

    public final void onSendTapped() {
        String obj;
        Object value;
        C61074JwC jwC;
        Integer num;
        0sn r2;
        LDR ldr = this.logger;
        C62652KkE kkE = ldr.A00;
        if (kkE == null) {
            0KC.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else {
            0wc r22 = ldr.A03;
            0Aj A00 = r22.A00(r22.A00, "ig_creator_agents_suggested_replies_tap_send");
            if (A00.isSampled()) {
                A00.A8M(kkE, "inbox_type");
                UUID uuid = ldr.A01;
                String str = null;
                if (uuid != null) {
                    str = uuid.toString();
                }
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                A00.AAJ("sr_session_id", str);
                UUID uuid2 = ldr.A02;
                if (!(uuid2 == null || (obj = uuid2.toString()) == null)) {
                    str2 = obj;
                }
                A00.AAJ("thread_session_id", str2);
                A00.Cgf();
            }
        }
        05G r5 = this._uiState;
        do {
            value = r5.getValue();
            jwC = (C61074JwC) value;
            num = AnonymousClass05K.A01;
            r2 = 0sn.A00;
        } while (!r5.AIY(value, C61074JwC.A01((AnonymousClass7L2) jwC.A03, num, (Integer) jwC.A01, r2)));
    }

    public final void refreshResponses() {
        String obj;
        LDR ldr = this.logger;
        C62652KkE kkE = ldr.A00;
        if (kkE == null) {
            0KC.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else {
            0wc r2 = ldr.A03;
            0Aj A00 = r2.A00(r2.A00, "ig_creator_agents_suggested_replies_tap_refresh");
            if (A00.isSampled()) {
                A00.A8M(kkE, "inbox_type");
                UUID uuid = ldr.A01;
                String str = null;
                if (uuid != null) {
                    str = uuid.toString();
                }
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                A00.AAJ("sr_session_id", str);
                UUID uuid2 = ldr.A02;
                if (!(uuid2 == null || (obj = uuid2.toString()) == null)) {
                    str2 = obj;
                }
                A00.AAJ("thread_session_id", str2);
                A00.Cgf();
            }
        }
        generateResponses(true);
    }

    public final void updateThread(AnonymousClass7GK r9) {
        2Er A01;
        User BZK;
        Long BST;
        String obj;
        C62652KkE kkE;
        Object value;
        C61074JwC jwC;
        Integer num;
        2Er A012;
        Object value2;
        C61074JwC jwC2;
        0sn r2;
        String str;
        C62652KkE kkE2;
        this.currentComposerState = r9;
        if (r9 != null && !r9.A03() && r9.A02 == AnonymousClass7GM.THREAD && (A01 = r9.A01()) != null && A01.C6a() == 1003) {
            2Er A013 = r9.A01();
            if (A013 != null) {
                int C66 = A013.C66();
                if (Integer.valueOf(C66) != null && (C66 == 0 || C66 == 1)) {
                    2Er A014 = r9.A01();
                    if (!(A014 == null || (BZK = A014.BZK()) == null || (BST = BZK.BST()) == null || (obj = BST.toString()) == null)) {
                        if (Boolean.valueOf(182.A06(0Tu.A05, this.userSession, 36321279997060323L)).booleanValue()) {
                            if (!0qQ.A0K(this.otherUserMessagingId, obj)) {
                                C262204Co r0 = this.currentJob;
                                if (r0 != null) {
                                    r0.AG7((CancellationException) null);
                                }
                                this.otherUserMessagingId = obj;
                                LDR ldr = this.logger;
                                ldr.A02 = AnonymousClass0HM.A00();
                                if (C66 != 0) {
                                    kkE2 = C62652KkE.GENERAL;
                                } else {
                                    kkE2 = C62652KkE.PRIMARY;
                                }
                                ldr.A00 = kkE2;
                                ldr.A01 = AnonymousClass0HM.A00();
                            }
                            LDR ldr2 = this.logger;
                            if (C66 != 0) {
                                kkE = C62652KkE.GENERAL;
                            } else {
                                kkE = C62652KkE.PRIMARY;
                            }
                            ldr2.A00 = kkE;
                            if (!((Boolean) this.settingsRepository.A01.getValue()).booleanValue()) {
                                if (isEligibleForInThreadOptInExperience(C66)) {
                                    Object obj2 = ((C61074JwC) this.uiState.getValue()).A00;
                                    Integer num2 = AnonymousClass05K.A0N;
                                    if (obj2 != num2) {
                                        LDR ldr3 = this.logger;
                                        C62652KkE kkE3 = ldr3.A00;
                                        if (kkE3 == null) {
                                            0KC.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
                                        } else {
                                            0wc r22 = ldr3.A03;
                                            0Aj A00 = r22.A00(r22.A00, "ig_creator_agents_suggested_replies_thread_opt_in_imp");
                                            if (A00.isSampled()) {
                                                A00.A8M(kkE3, "inbox_type");
                                                UUID uuid = ldr3.A02;
                                                if (uuid == null || (str = uuid.toString()) == null) {
                                                    str = "";
                                                }
                                                A00.AAJ("thread_session_id", str);
                                                A00.Cgf();
                                            }
                                        }
                                    }
                                    05G r5 = this._uiState;
                                    do {
                                        value2 = r5.getValue();
                                        jwC2 = (C61074JwC) value2;
                                        r2 = 0sn.A00;
                                    } while (!r5.AIY(value2, C61074JwC.A01((AnonymousClass7L2) jwC2.A03, num2, (Integer) jwC2.A01, r2)));
                                    return;
                                }
                            } else if (C66 != 1 || (A012 = r9.A01()) == null || !A012.CW5()) {
                                05G r6 = this._uiState;
                                do {
                                    value = r6.getValue();
                                    jwC = (C61074JwC) value;
                                    if (this.isKeyboardShowing) {
                                        num = AnonymousClass05K.A00;
                                    } else {
                                        num = AnonymousClass05K.A01;
                                    }
                                } while (!r6.AIY(value, C61074JwC.A01((AnonymousClass7L2) jwC.A03, num, AnonymousClass05K.A00, 0sn.A00)));
                                return;
                            } else {
                                onContainerExpanded(true);
                                return;
                            }
                        }
                    }
                }
            }
            hideAndReset();
        }
        this.otherUserMessagingId = null;
        hideAndReset();
    }

    public final void init() {
        C318136oS A00 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new MFR(this, (AnonymousClass4D7) null, 1), A00);
    }
}
