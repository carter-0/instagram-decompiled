package com.instagram.direct.request.graphql;

import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C66579MXk;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

public final class IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XfbMessagingSearchGenaiSnippet extends C250663lr implements C250673ls {

        public final class Edges extends C250663lr implements C250673ls {

            public final class Node extends C250663lr implements C250673ls {

                public final class AgentResponse extends C250663lr implements C250673ls {

                    public final class PluginResponse extends C250663lr implements C250673ls {

                        public final class ProxyRefusal extends C250663lr implements C250673ls {
                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "classification");
                            }

                            public ProxyRefusal() {
                                super(-673399849);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0Y(ProxyRefusal.class, C66579MXk.A00(1056), -673399849);
                        }

                        public PluginResponse() {
                            super(-1565198237);
                        }
                    }

                    public final class Response extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "content");
                        }

                        public Response() {
                            super(-359384102);
                        }
                    }

                    public final class ResponseMetadata extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, TraceFieldType.RequestID), "response_id");
                        }

                        public ResponseMetadata() {
                            super(-820079222);
                        }
                    }

                    public final class ViewModels extends C250663lr implements C250673ls {

                        public final class InlineXFBGenAISearchViewModel extends C250663lr implements C250673ls {

                            public final class SearchData extends C250663lr implements C250673ls {
                                public final AnonymousClass4Kx modelSelectionSet() {
                                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                                    return C41846B3n.A0M(new AnonymousClass4L7(r1, "attribution_link"), new AnonymousClass4L7(r1, "search_query"), new AnonymousClass4L7(r1, "search_engine"), new AnonymousClass4L7(AnonymousClass4Kz.A02(), "search_result_uri"), new AnonymousClass4L7(AnonymousClass4Kz.A02(), "references_title"));
                                }

                                public SearchData() {
                                    super(-1115050810);
                                }
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0Y(SearchData.class, "search_data", -1115050810);
                            }

                            public InlineXFBGenAISearchViewModel() {
                                super(-1611493295);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41847B3o.A0l(C41846B3n.A0D(AnonymousClass4Kz.A00), C41845B3m.A08(InlineXFBGenAISearchViewModel.class, "InlineXFBGenAISearchViewModel", -1611493295), C66579MXk.A00(634));
                        }

                        public ViewModels() {
                            super(1798107368);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41846B3n.A0L(C41845B3m.A0C(Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, -359384102), C41845B3m.A0C(PluginResponse.class, C66579MXk.A00(1040), -1565198237), C41845B3m.A0C(ResponseMetadata.class, "response_metadata", -820079222), C41845B3m.A0A(AnonymousClass4Ks.A02(), ViewModels.class, "view_models", 1798107368));
                    }

                    public AgentResponse() {
                        super(-1157881651);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41847B3o.A0k(C41845B3m.A0L(AnonymousClass4Kz.A00), AnonymousClass7TE.A0f(AnonymousClass4Kz.A02(), C66579MXk.A00(42)), AgentResponse.class, C66579MXk.A00(650), -1157881651);
                }

                public Node() {
                    super(-654084169);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "cursor"), Node.class, "node", -654084169);
            }

            public Edges() {
                super(436543290);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), Edges.class, "edges", 436543290);
        }

        public XfbMessagingSearchGenaiSnippet() {
            super(-555376563);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XfbMessagingSearchGenaiSnippet.class, C66579MXk.A00(1207), -555376563);
    }

    public IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl() {
        super(-523382187);
    }
}
