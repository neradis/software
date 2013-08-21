package org.nlp2rdf.core.vocab;

import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntModel;

/**
 * This class was automatically generated from http://persistence.uni-leipzig.org/nlp2rdf/ontologies/nif-core#
 * @author croeder
 */
public enum NIFObjectProperties {

    /**
     * TODO add label -> see nif:nextSentence
     */
    nextWordTrans,

    /**
     * sub string -> This property together with nif:subString, nif:superString, and their transitive extension can be used to express that one string is contained in another one. Examples: "a" nif:subString "apple" , "apple" nif:subString "apple".  The transitivity axioms are included in nif-core-inf.ttl and need to be included separately to keep a low reasoning profile. They are modeled after skos:broader and skos:broaderTransitive
     */
    subString,

    /**
     * source URL -> The URL the context was extracted from, e.g. the blog or news article url. Doesn't matter whether it is HTML or XML or plain text. rdfs:range is foaf:Document, if the string comes form another NIF String, please use nif:wasConvertedFrom
     */
    sourceUrl,

    /**
     * TODO add label -> This property links a URI of type OccuringWord to other nif:String, that occur in the same context.
     */
    occurrence,

    /**
     * annotation -> 
      see Towards Web-Scale Collaborative Knowledge Extraction  http://svn.aksw.org/papers/2012/PeoplesWeb/public_preprint.pdf‎ page 5 .
    
     */
    annotation,

    /**
     * TODO add label -> see nif:nextSentence
     */
    previousWord,

    /**
     * reference context -> Links a URI of a string to its reference context of type nif:Context.  The reference context determines the calculation of begin and end index
    Each String that is not an instance of nif:Context MUST have exactly one reference context. 
    
    Inferences (nif-core-inf.ttl): 
    Instances of nif:Context do have itself as reference context, this is inferred automatically, MAY be materialized, as well.  
    
    OWL validation (nif-core-val.ttl): 
    This property is functional.
    
    Changelog:
    * 1.0.0: Introduced stable version.
    
     */
    referenceContext,

    /**
     * super String -> see nif:subString
     */
    superString,

    /**
     * confidence level -> the level of confidence for this Annotation (introduced by STANBOL-631).
     */
    confidence_level,

    /**
     * TODO add label -> see nif:nextSentence
     */
    previousWordTrans,

    /**
     * TODO add label -> see nif:nextSentence
     */
    previousSentence,

    /**
     * broader Context -> This property should be used to express that one Context is contained in another Context, e.g. several sentences of a document are modelled indivudally and refer to the broader context of the whole document.
     */
    broaderContext,

    /**
     * OLiA link -> This property links a string to a URI from one of the OLiA Annotation model, e.g. http://purl.org/olia/penn.owl#NNP 
     */
    oliaLink,

    /**
     * has first word -> This property links sentences to their first word.
     */
    firstWord,

    /**
     * transitive version of superString -> see nif:subString
     */
    superStringTrans,

    /**
     * narrower Context -> The inverse of nif:narrowerContext
     */
    narrowerContext,

    /**
     * opinion -> This property is used to link to a marl:Opinion. We have not investigated marl, so it might be replaced. http://marl.gi2mo.org/?page_id=1#overview . InverseOf marl:extractedFrom
     */
    opinion,

    /**
     * TODO add label -> see nif:nextSentence
     */
    nextWord,

    /**
     * TODO add label -> see nif:nextSentence
     */
    nextSentenceTrans,

    /**
     * extracted from -> links a nif:String to a nif:Annotation .
     */
    extractedFrom,

    /**
     * has first word -> This property links sentences to their last word.
     */
    lastWord,

    /**
     * transitive version of subString -> see nif:subString
     */
    subStringTrans,

    /**
     * has word -> This property links sentences to their words.
     */
    word,

    /**
     * TODO add label -> This property links words to their sentence.
     */
    sentence,

    /**
     * TODO add label -> This property (and nif:previousSentence, nif:nextWord, nif:previousWord and their transitive extension) can be used to make resources of nif:Sentence and nif:Word traversable, it can not be assumed that no gaps or whitespaces between sentences or words exist, i.e. string adjacency is not mandatory. The transitivity axioms are included in nif-core-inf.ttl and need to be included separately to keep a low reasoning profile. They are modeled after skos:broader and skos:broaderTransitive
     */
    nextSentence,

    /**
     * TODO add label -> see nif:nextSentence
     */
    previousSentenceTrans,

    /**
     * was converted from -> This property should be used, when mapping one NIF String URIScheme to another.
    It mainly is used to provide provenance during a conversion process, e.g. when removing tags from XHTML and then linking XPath URIs to NIF index based URIs (e.g.  RFC 5147 with char=x,y).
    An example of the usage of this property can be found here: http://www.w3.org/TR/its20/#conversion-to-nif
    
     */
    wasConvertedFrom;

    String uri;

    NIFObjectProperties() {
        this.uri = "http://persistence.uni-leipzig.org/nlp2rdf/ontologies/nif-core#" + name();
    }

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return "nif:" + name();
    }


    public ObjectProperty getObjectProperty(OntModel model) {
        return model.createObjectProperty(getUri());
    }
}