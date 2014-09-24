class A
  def self.a
    "class method"
  end
end

fail if A.a != "class method"

begin
  A.new.a
rescue NoMethodError
  puts "instance cannot call classmethod"
end
