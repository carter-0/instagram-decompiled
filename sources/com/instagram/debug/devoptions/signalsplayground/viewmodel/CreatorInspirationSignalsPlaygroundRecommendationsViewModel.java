package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.02o;
import X.02z;
import X.05D;
import X.05G;
import X.0V1;
import X.0V2;
import X.0eS;
import X.0oU;
import X.0qQ;
import X.0sL;
import X.106;
import X.10D;
import X.10b;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.2YL;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C228042kh;
import X.C262204Co;
import X.C262224Cq;
import X.C318116oQ;
import X.C318136oS;
import X.C51965G9l;
import X.C51974G9v;
import X.C60340gF;
import X.C61770pa;
import X.DbS;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundDataSource;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository;
import com.instagram.debug.devoptions.signalsplayground.util.CreatorInspirationSignalsPlaygroundLoggerUtil;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundRecommendationsViewModel extends 2YL {
    public final 05G _uiState;
    public final 0V2 _viewEffect;
    public String currentRecommendationId;
    public Map recommendationsFeedback = AnonymousClass7TE.A1H();
    public final CreatorInspirationSignalsPlaygroundRepository repository;
    public final AnonymousClass0Ud uiState;
    public final C61770pa viewEffect;

    @DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$1", f = "CreatorInspirationSignalsPlaygroundRecommendationsViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$1, X.4D7] */
        public final Object invokeSuspend(Object obj) {
            1Hj r4 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                final CreatorInspirationSignalsPlaygroundRecommendationsViewModel creatorInspirationSignalsPlaygroundRecommendationsViewModel = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this;
                AnonymousClass0Ud r1 = creatorInspirationSignalsPlaygroundRecommendationsViewModel.repository.signalRecommendationsState;
                AnonymousClass1 r0 = new 02o() {
                    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011b, code lost:
                        r0 = new com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loaded(r2);
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(X.MQ0 r7, X.AnonymousClass4D7 r8) {
                        /*
                            r6 = this;
                            boolean r0 = r7 instanceof X.C59702JUj
                            if (r0 == 0) goto L_0x0010
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this
                            X.05G r3 = r0._uiState
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState$Loading r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loading.INSTANCE
                        L_0x000a:
                            r3.Epw(r0)
                        L_0x000d:
                            X.0gF r0 = X.C60340gF.A00
                            return r0
                        L_0x0010:
                            r0 = 1
                            boolean r0 = X.C59678JTj.A01(r0, r7)
                            if (r0 == 0) goto L_0x0122
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r5 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this
                            X.JTj r7 = (X.C59678JTj) r7
                            java.lang.Object r2 = r7.A01
                            java.lang.Iterable r2 = (java.lang.Iterable) r2
                            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
                            java.util.Iterator r4 = r2.iterator()
                        L_0x0027:
                            boolean r0 = r4.hasNext()
                            if (r0 == 0) goto L_0x0054
                            java.lang.Object r1 = r4.next()
                            com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem r1 = (com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem) r1
                            boolean r0 = r1 instanceof com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.ClipsRecommendation
                            if (r0 == 0) goto L_0x0049
                            com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$ClipsRecommendation r1 = (com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.ClipsRecommendation) r1
                            X.4bN r0 = r1.clipsItem
                            X.1Xj r0 = r0.A02
                            if (r0 == 0) goto L_0x0027
                            java.lang.String r0 = r0.A2n()
                        L_0x0043:
                            if (r0 == 0) goto L_0x0027
                            r3.add(r0)
                            goto L_0x0027
                        L_0x0049:
                            boolean r0 = r1 instanceof com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.AudioRecommendation
                            if (r0 == 0) goto L_0x0130
                            com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$AudioRecommendation r1 = (com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.AudioRecommendation) r1
                            X.Uq6 r0 = r1.audioItem
                            java.lang.String r0 = r0.A07
                            goto L_0x0043
                        L_0x0054:
                            r0 = 10
                            int r0 = X.0Yv.A1E(r3, r0)
                            int r0 = X.AnonymousClass7TG.A01(r0)
                            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
                            java.util.Iterator r3 = r3.iterator()
                        L_0x0066:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L_0x0076
                            java.lang.Object r1 = r3.next()
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.UNKNOWN
                            r4.put(r1, r0)
                            goto L_0x0066
                        L_0x0076:
                            java.util.LinkedHashMap r0 = X.0Yt.A03(r4)
                            r5.recommendationsFeedback = r0
                            boolean r3 = r2 instanceof java.util.Collection
                            if (r3 == 0) goto L_0x0096
                            r0 = r2
                            java.util.Collection r0 = (java.util.Collection) r0
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L_0x0096
                        L_0x0089:
                            if (r3 == 0) goto L_0x00c7
                            r0 = r2
                            java.util.Collection r0 = (java.util.Collection) r0
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L_0x00c7
                            goto L_0x000d
                        L_0x0096:
                            java.util.Iterator r1 = r2.iterator()
                        L_0x009a:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L_0x0089
                            java.lang.Object r0 = r1.next()
                            boolean r0 = r0 instanceof com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.ClipsRecommendation
                            if (r0 == 0) goto L_0x009a
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this
                            X.05G r3 = r0._uiState
                            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r2)
                            java.util.Iterator r2 = r2.iterator()
                        L_0x00b4:
                            boolean r0 = r2.hasNext()
                            if (r0 == 0) goto L_0x010a
                            java.lang.Object r1 = r2.next()
                            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.ClipsRecommendation"
                            X.0qQ.A0C(r1, r0)
                            r4.add(r1)
                            goto L_0x00b4
                        L_0x00c7:
                            java.util.Iterator r1 = r2.iterator()
                        L_0x00cb:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L_0x000d
                            java.lang.Object r0 = r1.next()
                            boolean r0 = r0 instanceof com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.AudioRecommendation
                            if (r0 == 0) goto L_0x00cb
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this
                            X.05G r3 = r0._uiState
                            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r2)
                            java.util.Iterator r2 = r2.iterator()
                        L_0x00e5:
                            boolean r0 = r2.hasNext()
                            if (r0 == 0) goto L_0x00f8
                            java.lang.Object r1 = r2.next()
                            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.AudioRecommendation"
                            X.0qQ.A0C(r1, r0)
                            r4.add(r1)
                            goto L_0x00e5
                        L_0x00f8:
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r1 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.UNKNOWN
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this
                            java.util.Map r0 = r0.recommendationsFeedback
                            boolean r0 = r0.containsValue(r1)
                            r0 = r0 ^ 1
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$ViewState$AudioViewState r2 = new com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$ViewState$AudioViewState
                            r2.<init>(r4, r1, r0)
                            goto L_0x011b
                        L_0x010a:
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r1 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.UNKNOWN
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this
                            java.util.Map r0 = r0.recommendationsFeedback
                            boolean r0 = r0.containsValue(r1)
                            r0 = r0 ^ 1
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$ViewState$ClipsViewState r2 = new com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$ViewState$ClipsViewState
                            r2.<init>(r4, r1, r0)
                        L_0x011b:
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState$Loaded r0 = new com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState$Loaded
                            r0.<init>(r2)
                            goto L_0x000a
                        L_0x0122:
                            boolean r0 = X.C59678JTj.A02(r7)
                            if (r0 == 0) goto L_0x0135
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this
                            X.05G r3 = r0._uiState
                            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState$Error r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Error.INSTANCE
                            goto L_0x000a
                        L_0x0130:
                            X.Wub r0 = X.AnonymousClass7TE.A1K()
                            throw r0
                        L_0x0135:
                            X.Wub r0 = X.AnonymousClass7TE.A1K()
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.AnonymousClass1.AnonymousClass1.emit(X.MQ0, X.4D7):java.lang.Object");
                    }
                };
                this.label = 1;
                if (r1.collect(r0, this) == r4) {
                    return r4;
                }
            } else if (i != 1) {
                throw AnonymousClass7TE.A0x();
            } else {
                0eS.A00(obj);
            }
            throw C51965G9l.A0x();
        }
    }

    public final class Factory extends C228042kh {
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            0qQ.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public CreatorInspirationSignalsPlaygroundRecommendationsViewModel create() {
            return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel(new CreatorInspirationSignalsPlaygroundRepository(this.userSession, (CreatorInspirationSignalsPlaygroundDataSource) null, 2, (DefaultConstructorMarker) null));
        }
    }

    public enum FeedbackType {
        UNKNOWN,
        RELEVANT,
        PARTIALLY_RELEVANT,
        NOT_RELEVANT;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            FeedbackType[] $values;
            $ENTRIES = 0oU.A00($values);
        }
    }

    public CreatorInspirationSignalsPlaygroundRecommendationsViewModel(CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository) {
        0qQ.A0B(creatorInspirationSignalsPlaygroundRepository, 1);
        this.repository = creatorInspirationSignalsPlaygroundRepository;
        02z A01 = 106.A01(UiState.Loading.INSTANCE);
        this._uiState = A01;
        this.uiState = 10b.A03(A01);
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this._viewEffect = A012;
        this.viewEffect = new 0V1((C262204Co) null, A012);
        C318136oS A00 = C318116oQ.A00(this);
        1Eo.A03(num, 19B.A00, new AnonymousClass1((AnonymousClass4D7) null), A00);
    }

    public final void performFeedbackButtonAction(UserSession userSession, AnonymousClass0iw r9, String str, String str2, FeedbackType feedbackType) {
        0qQ.A0B(userSession, 0);
        C51974G9v.A1P(r9, str, str2, feedbackType);
        CreatorInspirationSignalsPlaygroundLoggerUtil.INSTANCE.reportFeedbackButtonClick(userSession, r9, this.currentRecommendationId, str, str2, getScoreForFeedbackType(feedbackType));
        String str3 = this.currentRecommendationId;
        if (str3 != null) {
            this.recommendationsFeedback.put(str3, feedbackType);
            updateCurrentFeedback();
            AnonymousClass7TE.A1Z(new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1(this, (AnonymousClass4D7) null), C318116oQ.A00(this));
        }
        if (!this.recommendationsFeedback.containsValue(FeedbackType.UNKNOWN)) {
            AnonymousClass7TE.A1Z(new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$2(this, (AnonymousClass4D7) null), C318116oQ.A00(this));
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001e */
        static {
            /*
                com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType[] r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.RELEVANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.PARTIALLY_RELEVANT     // Catch:{ NoSuchFieldError -> 0x0015 }
                X.C51970G9q.A1M(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.NOT_RELEVANT     // Catch:{ NoSuchFieldError -> 0x001e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r0 = com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                $EnumSwitchMapping$0 = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.WhenMappings.<clinit>():void");
        }
    }

    public final AnonymousClass0Ud getUiState() {
        return this.uiState;
    }

    public final C61770pa getViewEffect() {
        return this.viewEffect;
    }

    public final void updateCurrentFeedback() {
        ViewState copy;
        FeedbackType feedbackType = (FeedbackType) this.recommendationsFeedback.get(this.currentRecommendationId);
        if (feedbackType != null) {
            05G r3 = this._uiState;
            boolean z = r3.getValue() instanceof UiState.Loaded;
            Object value = this._uiState.getValue();
            if (z) {
                0qQ.A0C(value, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loaded");
                ViewState viewState = ((UiState.Loaded) value).viewState;
                if (viewState instanceof ViewState.ClipsViewState) {
                    ViewState.ClipsViewState clipsViewState = (ViewState.ClipsViewState) viewState;
                    copy = clipsViewState.copy(clipsViewState.recommendations, feedbackType, clipsViewState.isFeedbackComplete);
                } else if (viewState instanceof ViewState.AudioViewState) {
                    ViewState.AudioViewState audioViewState = (ViewState.AudioViewState) viewState;
                    copy = audioViewState.copy(audioViewState.recommendations, feedbackType, audioViewState.isFeedbackComplete);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                value = new UiState.Loaded(copy);
            }
            r3.Epw(value);
        }
    }

    private final int getScoreForFeedbackType(FeedbackType feedbackType) {
        int ordinal = feedbackType.ordinal();
        if (ordinal == 1) {
            return 100;
        }
        if (ordinal == 2) {
            return 50;
        }
        if (ordinal == 3 || ordinal == 0) {
            return 0;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final void fetchSignalRecommendations(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        AnonymousClass7TE.A1Z(new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1(this, str, str2, (AnonymousClass4D7) null), C318116oQ.A00(this));
    }

    public abstract class UiState {

        public final class Error extends UiState {
            public static final Error INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public int hashCode() {
                return -1505289528;
            }

            public String toString() {
                return "Error";
            }
        }

        public final class Loaded extends UiState {
            public final ViewState viewState;

            public Loaded(ViewState viewState2) {
                0qQ.A0B(viewState2, 1);
                this.viewState = viewState2;
            }

            public final ViewState component1() {
                return this.viewState;
            }

            public final Loaded copy(ViewState viewState2) {
                0qQ.A0B(viewState2, 0);
                return new Loaded(viewState2);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Loaded) && 0qQ.A0K(this.viewState, ((Loaded) obj).viewState));
            }

            public int hashCode() {
                return this.viewState.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ Loaded copy$default(Loaded loaded, ViewState viewState2, int i, Object obj) {
                if ((i & 1) != 0) {
                    viewState2 = loaded.viewState;
                }
                0qQ.A0B(viewState2, 0);
                return new Loaded(viewState2);
            }

            public final ViewState getViewState() {
                return this.viewState;
            }
        }

        public final class Loading extends UiState {
            public static final Loading INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return -1658586628;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public UiState() {
        }
    }

    public abstract class ViewEffect {

        public final class FeedbackComplete extends ViewEffect {
            public static final FeedbackComplete INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof FeedbackComplete);
            }

            public int hashCode() {
                return 1703738439;
            }

            public String toString() {
                return "FeedbackComplete";
            }
        }

        public final class ScrollToNextPosition extends ViewEffect {
            public static final ScrollToNextPosition INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ScrollToNextPosition);
            }

            public int hashCode() {
                return 1851859821;
            }

            public String toString() {
                return "ScrollToNextPosition";
            }
        }

        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public ViewEffect() {
        }
    }

    public abstract class ViewState {

        public final class AudioViewState extends ViewState {
            public final FeedbackType currentFeedback;
            public final boolean isFeedbackComplete;
            public final List recommendations;

            public static /* synthetic */ AudioViewState copy$default(AudioViewState audioViewState, List list, FeedbackType feedbackType, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = audioViewState.recommendations;
                }
                if ((i & 2) != 0) {
                    feedbackType = audioViewState.currentFeedback;
                }
                if ((i & 4) != 0) {
                    z = audioViewState.isFeedbackComplete;
                }
                return audioViewState.copy(list, feedbackType, z);
            }

            public final List component1() {
                return this.recommendations;
            }

            public final FeedbackType component2() {
                return this.currentFeedback;
            }

            public final boolean component3() {
                return this.isFeedbackComplete;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof AudioViewState) {
                        AudioViewState audioViewState = (AudioViewState) obj;
                        if (!(0qQ.A0K(this.recommendations, audioViewState.recommendations) && this.currentFeedback == audioViewState.currentFeedback && this.isFeedbackComplete == audioViewState.isFeedbackComplete)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public String toString() {
                return super.toString();
            }

            public FeedbackType getCurrentFeedback() {
                return this.currentFeedback;
            }

            public List getRecommendations() {
                return this.recommendations;
            }

            public int hashCode() {
                return DbS.A06(this.isFeedbackComplete, AnonymousClass7TF.A07(this.currentFeedback, AnonymousClass7TE.A0K(this.recommendations)));
            }

            public boolean isFeedbackComplete() {
                return this.isFeedbackComplete;
            }

            public AudioViewState(List list, FeedbackType feedbackType, boolean z) {
                AnonymousClass7TG.A1O(list, feedbackType);
                this.recommendations = list;
                this.currentFeedback = feedbackType;
                this.isFeedbackComplete = z;
            }

            public final AudioViewState copy(List list, FeedbackType feedbackType, boolean z) {
                AnonymousClass7TG.A1N(list, feedbackType);
                return new AudioViewState(list, feedbackType, z);
            }
        }

        public final class ClipsViewState extends ViewState {
            public final FeedbackType currentFeedback;
            public final boolean isFeedbackComplete;
            public final List recommendations;

            public static /* synthetic */ ClipsViewState copy$default(ClipsViewState clipsViewState, List list, FeedbackType feedbackType, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = clipsViewState.recommendations;
                }
                if ((i & 2) != 0) {
                    feedbackType = clipsViewState.currentFeedback;
                }
                if ((i & 4) != 0) {
                    z = clipsViewState.isFeedbackComplete;
                }
                return clipsViewState.copy(list, feedbackType, z);
            }

            public final List component1() {
                return this.recommendations;
            }

            public final FeedbackType component2() {
                return this.currentFeedback;
            }

            public final boolean component3() {
                return this.isFeedbackComplete;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof ClipsViewState) {
                        ClipsViewState clipsViewState = (ClipsViewState) obj;
                        if (!(0qQ.A0K(this.recommendations, clipsViewState.recommendations) && this.currentFeedback == clipsViewState.currentFeedback && this.isFeedbackComplete == clipsViewState.isFeedbackComplete)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public String toString() {
                return super.toString();
            }

            public FeedbackType getCurrentFeedback() {
                return this.currentFeedback;
            }

            public List getRecommendations() {
                return this.recommendations;
            }

            public int hashCode() {
                return DbS.A06(this.isFeedbackComplete, AnonymousClass7TF.A07(this.currentFeedback, AnonymousClass7TE.A0K(this.recommendations)));
            }

            public boolean isFeedbackComplete() {
                return this.isFeedbackComplete;
            }

            public ClipsViewState(List list, FeedbackType feedbackType, boolean z) {
                AnonymousClass7TG.A1O(list, feedbackType);
                this.recommendations = list;
                this.currentFeedback = feedbackType;
                this.isFeedbackComplete = z;
            }

            public final ClipsViewState copy(List list, FeedbackType feedbackType, boolean z) {
                AnonymousClass7TG.A1N(list, feedbackType);
                return new ClipsViewState(list, feedbackType, z);
            }
        }

        public abstract FeedbackType getCurrentFeedback();

        public abstract List getRecommendations();

        public abstract boolean isFeedbackComplete();

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public ViewState() {
        }
    }

    public final void setCurrentRecommendationId(String str) {
        this.currentRecommendationId = str;
    }
}
