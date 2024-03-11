(ns nanoGPT-clj.core)


;; A simple character based tokenizer
;; @TODO Replace with something similar to tiktoken
;; @TODO Create a protocol for tokenizer

(defn encode
  [in]
  (map int in))

(defn decode
  [in]
  (apply str (map char in)))


(comment
  (let [x "hello world"]
    (= (decode (encode x))
       x)))
